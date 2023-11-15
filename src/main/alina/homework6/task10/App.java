package homework6.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

        BlackListFilterClass filter = new BlackListFilterClass();

        List<String> comments = new ArrayList<>();

        comments.add("допустимный комментарий");
        comments.add("""
                недопустимый\s
                в несколько строчек комментарий\s
                спам
                """);
        comments.add("недопустимный комментарий спам");

        List<String> blackList = new ArrayList<>();

        blackList.add("спам");

        Predicate<String> filterCondition = comment -> {
            for (String word : comment.split("\\s+")) {
                if (blackList.contains(word.toLowerCase())) {
                    return true;
                }
            }
            return false;
        };

        Collection<String> filtered = filter.filterComments(comments, filterCondition);

        System.out.println("Filtered comments: " + filtered);
    }
}

