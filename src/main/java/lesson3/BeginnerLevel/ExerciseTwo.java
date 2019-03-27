package lesson3.BeginnerLevel;

import java.util.Scanner;

public class ExerciseTwo {
    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        int x = a + b;
        boolean res;
        res = a == 10 || b == 10 || x == 10;
        System.out.println(res);
    }
}