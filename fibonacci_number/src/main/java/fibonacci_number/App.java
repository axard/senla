package fibonacci_number;

import java.util.Scanner;

public class App {
    public static int getFibonacciNumber(int n) {
        if (n < 3) {
            return 1;
        } else {
            return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
        }
    }

    public static void main(String[] args) {
        boolean hasNumber = false;
        int number = 0;

        Scanner sc = new Scanner(System.in);
        while (!hasNumber) {

            System.out.print("Введите № числа Фибоначчи: ");
            hasNumber = sc.hasNextInt();

            if (!hasNumber) {

                System.out.println(" <-- Это что-то не то. Пожалуйста, просто номер.");

            } else {

                number = sc.nextInt();
                if (number <= 0) {

                    System.out.println(" <-- Номер должен быть больше нуля.");

                }
            }
        }
        sc.close();

        for (int n = 1; n <= number; n++) {
            System.out.print(getFibonacciNumber(n));

            if (n != number) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}
