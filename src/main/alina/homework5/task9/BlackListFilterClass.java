package homework5.task9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BlackListFilterClass implements BlackListFilter{
    public boolean isTypo (String word, String badWord) {
        int diff = 0;
        if (word.length() != badWord.length()) { // не стала считать опечаткой слово на букву меньше/больше, так как
            // в случае со словом спам может получиться спа, например
            return false;
        }
        for (int i = 0; i < word.length(); i ++) {
            if (word.charAt(i) != badWord.charAt(i)) {
                diff += 1;
                if (diff > 1) {
                    return false;
                }
            }
        }
        return diff == 1;
    }
    @Override
    public void filterComments(List<String> comments, Set<String> blackList) {
        List<String> filteredComments = new ArrayList<>(); //2 версия
        Iterator<String> iterator = comments.iterator();
        while (iterator.hasNext()) {
            String comment = iterator.next();
            String[] words = comment.split("[\\s,.!?:;]+");
            for (String word : words) {
                for (String badWord: blackList) {
                    if (word.toLowerCase().contains(badWord.toLowerCase()) || isTypo(word,
                            badWord)) { //если поменять местами, то падежи не будут учитываться
                        String starChar = "*"; // 2 и 3 версия
                        comment = comment.replace(word, starChar.repeat(word.length())); // 2 и 3 версия
                        // iterator.remove(); 1 версия
                        // break; 1 версия
                    }
                }
            }
            filteredComments.add(comment); // 2 и 3 версия
        }
        comments.clear(); // 2 и 3 версия
        comments.addAll(filteredComments); // 2 и 3 версия
    }
}

