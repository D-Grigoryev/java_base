package lesson_4;
//1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> lis = new LinkedList<>();
        lis.add(1);
        lis.add(2);
        lis.add(3);
        lis.add(4);
        System.out.println(lis);
        revers(lis);

    }

    public static void revers(LinkedList<Integer> l) {
        Deque<Integer> dq = new ArrayDeque<>();

        for (Object o : l) {
            dq.push((Integer) o);
        }
        for (Object ob : dq) {
            System.out.print(" "+ob);
        }
    }
}
