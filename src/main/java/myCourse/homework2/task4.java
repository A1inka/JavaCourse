package myCourse.homework2;

public class task4 {

    public static void main(String[] args) {

        int initialElement = Integer.parseInt(args[0]);
        int progressionDifference = Integer.parseInt(args[1]);
        int amountOfElements = Integer.parseInt(args[2]);

        long sum = initialElement;

        for (int i = 1; i < amountOfElements; i ++ ) {
            sum += (initialElement + progressionDifference * i);
        }

        System.out.println("Sum: " + sum);

    }

}
