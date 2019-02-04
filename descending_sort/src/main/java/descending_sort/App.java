package descending_sort;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static String readLine() {
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        sc.close();
        return result;
    }

    public static ArrayList<Integer> readIntegerArray() {
        System.out.print("Введите массив целых чисел через пробел: ");
        ArrayList<Integer> result = new ArrayList<Integer>();
        Scanner sc = new Scanner(readLine());
        while (sc.hasNextInt()) {
            result.add(sc.nextInt());
        }
        sc.close();
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = readIntegerArray();
        Collections.sort(integers, Comparator.reverseOrder());
        for (Integer i : integers) {
            System.out.printf("%d ", i);
        }
    }
}
