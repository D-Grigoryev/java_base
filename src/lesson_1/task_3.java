package lesson_1;
//3) Реализовать простой калькулятор

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc c = new Calc();

        System.out.println("Простой калькулятор");
        System.out.println("Введите первое число: ");
        int numfirst = Integer.parseInt(sc.nextLine());
        System.out.println("Введите второе число: ");
        int numSecond = Integer.parseInt(sc.nextLine());

        System.out.println("Cумма чисел: " + numfirst + " и " + numSecond + " равна: "
                + c.summNumbers(numfirst, numSecond));
        System.out.println("Разница чисел: " + numfirst + " и " + numSecond + " равна: "
                + c.minusNumbers(numfirst, numSecond));
        System.out.println("Результат диления чисел: " + numfirst + " и " + numSecond +
                " равен: " + c.divisionNumbers(numfirst, numSecond));
        System.out.println("Результат умножения чисел: " + numfirst + " и " + numSecond +
                " равен: " + c.multNumbers(numfirst, numSecond));
    }
    public static class Calc{
        public static int summNumbers(int a, int b){
            return a + b;
        }
        public static int minusNumbers(int a, int b){
            return a - b;
        }
        public static double divisionNumbers(double a, double b){
            try {
                return a / b;
            }catch (ArithmeticException e) {
                e.printStackTrace();
            }
            return 0;
        }
        public static int multNumbers(int a, int b){
            return a * b;
        }
    }
}
