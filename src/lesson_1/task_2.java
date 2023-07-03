package lesson_1;
//2) Вывести все простые числа от 1 до 1000

public class task_2 {
    public static void main(String[] args) {
        printEasyNumbers();
    }
    public static void printEasyNumbers(){
        for (int i = 1; i <= 1000; i++) {
            double x = 2.3;
            if (i % 1 == 0 || i % i == 0) System.out.println(i);
        }
    }
}
