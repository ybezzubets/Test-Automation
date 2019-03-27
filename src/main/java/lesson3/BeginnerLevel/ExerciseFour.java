package lesson3.BeginnerLevel;

public class ExerciseFour {

    private static void itsMyVoid(int[] b, int c) {
        int cnt = 0;
        for(int i = 0; i < b.length; i++) {
            if( b[i] == c)
                cnt++;
        }
        System.out.print(cnt);
    }

    public static void main(String[] args) {
        itsMyVoid(new int[]{1, 2, 3, 5, 7, 9, 5, 5}, 5);
    }
}