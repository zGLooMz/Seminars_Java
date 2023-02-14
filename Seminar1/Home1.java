
import java.util.Arrays;

public class Home1 {
    public static void main(String[] args) {
        System.out.println("Лежит в приделах интервала: " + isSumBetween10And20(5, 15));
        System.out.println("Лежит в приделах интервала: " + isSumBetween10And20(10, 15));
        System.out.println("Число положительное: " + isPositive(5));
        System.out.println(printString("abcd", 5));
        System.out.println("Год високосный: " + leap(2024));
        System.out.println(Arrays.toString(createArray(8, 5)));
        int[] s = { 0, 1, 1, 0, 1, 0, 1, 0, 0, 1 };
        System.out.println("Массив1: " + Arrays.toString(s));
        System.out.println("Массив2: " + Arrays.toString(invert(s)));
        int[] b = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Массив1: " + Arrays.toString(b));
        System.out.println("Массив2: " + Arrays.toString(findAndMultiply(b)));
        int[] k = { 3, 5, 15, 11, 4, 1, 4, 8, 9 };
        System.out.println("Массив3: " + Arrays.toString(k));
        minMax(k);
        // --------------------------------------------------------------------
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x)
                    arr[i][j] = 1;
                else
                    arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // ---------------------------------------------------------------------
    }

    private static boolean isSumBetween10And20(int a, int b) {
        int result = a + b;
        return (result >= 10 && result <= 20);
    }

    private static boolean isPositive(int x) {
        if (x >= 0)
            ;
        return true;
    }

    private static String printString(String source, int repeat) {
        String result = "";
        int i = 0;
        while (i < repeat) {
            result = result + source;
            i++;
        }
        return result;
    }

    public static boolean leap(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    private static int[] createArray(int len, int initalValue) {
        int[] mass = new int[len];

        for (int i = 0; i < len; i++) {
            mass[i] = initalValue;
        }
        return mass;
    }

    public static int[] invert(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[i] = 0;
            } else
                a[i] = 1;
        }
        return a;
    }

    public static int[] findAndMultiply(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
        }
        return a;
    }

    public static void minMax(int[] a) {
        int max = a[1], min = a[1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max: " + max + " Min: " + min);
    }
}