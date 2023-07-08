package lesson_3;

import java.util.*;

//        Пусть дан произвольный список целых чисел.
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение
public class homework {
    public static void main(String[] args) {
        int arr[] = {1, 10, 7,25, 89, 100};
        ArrayList <Integer> lis = new ArrayList<>();
        creatArr(arr, lis);
        System.out.println("Все элементы списка: "+lis);
        System.out.println("Максимальный элемент в списке: "+Collections.max(lis));
        System.out.println("Минимальный элемент в списке: " +Collections.min(lis));
        System.out.println("Среднее знаачение элементов в списке: "+average(lis));
        delEl(lis);
        System.out.println("Нечетные элементы списка: "+lis);


    }
    public static void creatArr(int[] a, ArrayList<Integer> b){
        for (int i = 0; i < a.length ; i++) {
            b.add(a[i]);
        }
    }

    public static void delEl(ArrayList<Integer> b){
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i)%2 == 0) b.remove(i);
        }
        }

        static double average (ArrayList<Integer> list) {

        double sum = 0;

        for(int i=0;i<list.size();i++) {
            sum+=list.get(i);
        }

        return sum/list.size();
    }


}





