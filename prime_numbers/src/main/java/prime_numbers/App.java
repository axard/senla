package prime_numbers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class App {
    public static Integer readN() {
        Scanner sc = new Scanner(System.in);
        Integer result = new Integer(sc.nextInt());
        sc.close();
        return result;
    }

    public static void main(String args[]) {
        System.out.print("Введите N до которого надо вычислить простые числа: ");
        try {
            EratosthenesSieve sieve = new EratosthenesSieve();
            sieve.fill(readN());

            ArrayList<Integer> primes = sieve.getPrimes();
            for (Integer prime : primes) {
                System.out.printf("%d ", prime);
            }
        } catch (InputMismatchException e) {
            System.out.print("Ошибка ввода.");
        }
    }
}
