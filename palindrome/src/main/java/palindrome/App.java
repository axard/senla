package palindrome;

import java.util.Scanner;

public class App {
    public static boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово для проверки на \"палиндромность\": ");
        String word = sc.nextLine();
        sc.close();
        if (isPalindrome(word)) {
            System.out.println("Это палиндром.");
        } else {
            System.out.println("Это не палиндром.");
        }
    }
}
