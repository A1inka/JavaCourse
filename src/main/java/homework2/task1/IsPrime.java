package homework2.task1;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        long num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println("Составное число");
            return;
        }

        for (int i = 3; i <= (Math.sqrt(num) + 1); i = i + 2) {
            if (num % i == 0) {
                System.out.println("Составное число");
                return;
            }
        }

        System.out.println("Простое число");

    }

}