package number_remover;

import java.util.Scanner;

class App {
    public static String readLine() {
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        sc.close();
        return result;
    }

    public static String numberRegex() {
        return "\\d(\\.?\\d)+";
    }

    public static String removeNumbers(String text) {
        return text.replaceAll(numberRegex(), "");
    }

    public static void main(String args[]) {
        System.out.println("Введите текст из которого хотите убрать цифры: ");
        String textInput = readLine();
        String textOutput = removeNumbers(textInput);
        System.out.println(textOutput);
    }
}
