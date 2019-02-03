package boolean_algebra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static final int numberOfBooleans = 4;
    static final int numberOfTrues = 2;

    public static boolean[] readFourBooleanValues() {
        boolean[] result = new boolean[numberOfBooleans];

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < numberOfBooleans) {
            System.out.print("Введите логическое значение: ");
            try {
                result[i] = sc.nextBoolean();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Неправильный формат значения. Должно быть \"true\" или \"false\"");
                sc.next();
            }
        }
        sc.close();

        return result;
    }

    public static void main(String[] args) {
        boolean[] values = readFourBooleanValues();
        int counterOfTrues = 0;
        for (boolean value : values) {
            if (value) {
                counterOfTrues++;
            }
        }

        if (counterOfTrues == numberOfTrues) {
            System.out.println("True");
        }
    }
}
