// 1. Создать метод, который проверяет, является ли строка палиндромом.

package Seminars_Java.Seminar2;

public class Home21 {
    private static boolean isPolindrom(String newStr) {
        if (newStr.length() == 1)
            return true;
        for (int i = 0; i < newStr.length() / 2; i++) {
            if (newStr.toLowerCase().charAt(i) != newStr.toLowerCase().charAt(newStr.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arrStr = { "шалаш", "Анна", "1234", "т", "торт", "qrtstrq", "123ш321", "5558554" };
        for (String s : arrStr)
            if (isPolindrom(s))
                System.out.printf("%s - полиндром \n", s);
            else
                System.out.printf("%s - не полиндром \n", s);
    }
}