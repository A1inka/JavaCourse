package homework6.task12;

import java.util.function.Predicate;
import java.util.function.Function;

public class TernaryOperator {
    public static <T, R> R applyTernaryOperator(Predicate<T> predicate, Function<T, R> trueFunction,
                                                Function<T, R> falseFunction, T value) {
        return predicate.test(value) ? transformAndApply(trueFunction, value) : transformAndApply(falseFunction, value);
    }

    public static <T, R> R transformAndApply(Function<T, R> function, T value) {
        T transformedValue = transformValue(value);
        return function.apply(transformedValue);
    }

    public static <T> T transformValue(T value) {
        if (value instanceof Integer) {
            return (T) Integer.valueOf(((Integer) value) * 2);
        } else {
            return value;
        }
    }

    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        Function<Integer, String> evenFunction = (n) -> "Четное";
        Function<Integer, String> oddFunction = (n) -> "Нечетное";

        System.out.println(applyTernaryOperator(isEven, evenFunction, oddFunction, 5));
        System.out.println(applyTernaryOperator(isEven, evenFunction, oddFunction, 7));
        System.out.println(applyTernaryOperator(isEven, evenFunction, oddFunction, 4));
    }
}

