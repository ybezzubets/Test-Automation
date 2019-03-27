package lesson3.BeginnerLevel;

import java.util.Scanner;

public class ExerciseThree {
    private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        boolean res;
        res = (a % 3) == 0 || (a % 5) == 0;
        System.out.println(res);
    }
}