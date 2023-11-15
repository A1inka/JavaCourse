package homework6.task12;

import java.util.function.Predicate;
import java.util.function.Function;

public class TernaryOperator {
    public static <T, R> R applyTernaryOperator(Predicate<T> predicate, Function<T, R> trueFunction,
                                                Function<T, R> falseFunction, T value) {
        return predicate.test(value) ? trueFunction.apply(value) : falseFunction.apply(value);
    }

    public static void main(String[] args) {
        // Примеры работы метода
        Predicate<Integer> isEven = (n) -> n % 2 == 0;

        Function<Integer, String> evenFunction = (n) -> "Четное";

        Function<Integer, String> oddFunction = (n) -> "Нечетное";

        System.out.println(applyTernaryOperator(isEven, evenFunction, oddFunction, 10)); // Вывод: "Четное"
        System.out.println(applyTernaryOperator(isEven, evenFunction, oddFunction, 7));  // Вывод: "Нечетное"
    }
}
