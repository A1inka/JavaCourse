package homework2.task2;

import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int initialElement = in.nextInt();
        int progressionDifference = in.nextInt();
        int amountOfElements = in.nextInt();

        int sum = initialElement;

        for (int i = 1; i < amountOfElements; i ++ ) {
            sum += (initialElement + progressionDifference * i);
        }

        System.out.println("Sum: " + sum);

    }

}
