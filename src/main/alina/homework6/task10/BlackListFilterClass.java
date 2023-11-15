package homework6.task10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class BlackListFilterClass implements BlackListFilter {
    public boolean isTypo(String word, String badWord) {
        int diff = 0;
        if (word.length() != badWord.length()) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != badWord.charAt(i)) {
                diff += 1;
                if (diff > 1) {
                    return false;
                }
            }
        }
        return diff == 1;
    }
}

