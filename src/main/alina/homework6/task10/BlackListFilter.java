package homework6.task10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public interface BlackListFilter {

    /**
     * From the given list of comments removes ones
     * that contain words from the black list.
     *
     * @param comments list of comments; every comment
     *                 is a sequence of words, separated
     *                 by spaces, punctuation or line breaks
     * @param predicate list of words that should not
     *                  be present in a comment
     */

    default <T> Collection<T> filterComments(List<T> comments, Predicate<T> predicate) {
        List<T> filteredComments = new ArrayList<>();
        for (T comment : comments) {
            if (!predicate.test(comment)) {
                filteredComments.add(comment);
            }
        }
        return filteredComments;
    }
}