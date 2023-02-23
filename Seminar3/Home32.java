// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

package Seminars_Java.Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Home32 {
    public class Task020 {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++)
                list.add((int) (Math.random() * 20));
            System.out.println(list);
            int min = list.get(0);
            int max = list.get(0);
            for (Integer i : list) {
                if (i < min)
                    min = i;
                if (i > max)
                    max = i;
            }
            Double average = list.stream().mapToInt(val -> val).average().orElse(0.0);
            System.out.println("Максимум: " + max);
            System.out.println("Максимум: " + Collections.max(list));
            System.out.println("Минимум: " + min);
            System.out.println("Минимум: " + Collections.min(list));
            System.out.println("Среднее арифметическое: " + getAverage(list));
            System.out.println("Среднее арифметическое: " + average);
        }

        public static double getAverage(List<Integer> list) {
            double summ = 0;
            for (Integer i : list) {
                summ += i;
            }
            return summ = summ / list.size();
        }
    }
}
