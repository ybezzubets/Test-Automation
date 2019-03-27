package lesson3.BeginnerLevel;

import java.util.ArrayList;

public class ExerciseOne {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        for (int i = 0; i < 10; ++i) {
            x.add(i);
        }
        print(x, "Значения в массиве:");
        multiply(x, 3);
        print(x, "\n" + "Результат умножения:");
    }
    private static void multiply(ArrayList<Integer> list, int k) {
        for (int i = 0; i < list.size(); ++i) {
            list.set(i, list.get(i) * k);
        }
    }
    private static void print(ArrayList<Integer> list, String text) {
        System.out.println(text);
        for (int i = 0; i < list.size(); ++i) {
            System.out.printf("%d ", list.get(i));
        }
    }
}