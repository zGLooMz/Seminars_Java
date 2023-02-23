// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

package Seminars_Java.Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Home31 {
    public class Task010 {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++)
                list.add((int) (Math.random() * 20));
            System.out.println(list);
            remove(list);
            System.out.println(list);
        }

        public static void remove(List<Integer> ints) {
            Iterator<Integer> it = ints.iterator();

            while (it.hasNext()) {
                if (it.next() % 2 == 0) {
                    it.remove();
                }
            }
        }
    }
}