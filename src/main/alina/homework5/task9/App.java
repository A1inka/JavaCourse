package homework5.task9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        List<String> comments = new ArrayList<>();
        Set<String> blackList = new HashSet<>();

        blackList.add("спам");

        comments.add("допустимный комментарий");
        comments.add("""
                недопустимый\s
                в несколько строчек комментарий\s
                спам
                """);
        comments.add("Недопустимый комментарий со спамом");
        comments.add("недопустимый комментарий со знаками препинания после слова спам.");
        comments.add("недопустимый комментарий со знаками препинания перед словом :спам");
        comments.add("недопустимый комментарий, написанный капсом СПАМ");
        comments.add("недопустимый комментарий c одной опечаткой спай");
        comments.add("допустимый комментарий c двумя опечатками опай");

        BlackListFilter filter = new BlackListFilterClass();
        filter.filterComments(comments, blackList);

        for (String comment: comments) {
            System.out.println(comment);
            System.out.println(" ");
        }
    }
}
