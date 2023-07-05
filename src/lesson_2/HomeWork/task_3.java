package lesson_2.HomeWork;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//        3) К калькулятору из предыдущего ДЗ добавить логирование.
public class task_3 {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                Logger logger = Logger.getLogger(task_3.class.getName());
                logger.setLevel(Level.INFO);
                ConsoleHandler ch = new ConsoleHandler();
                logger.addHandler(ch);
                SimpleFormatter sf = new SimpleFormatter();
                ch.setFormatter(sf);
                logger.log(Level.WARNING, "Тестоовое логирование");
                logger.info("Тестовое логирование");

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
            public static class Calc {
                public static int summNumbers(int a, int b) {
                    return a + b;
                }

                public static int minusNumbers(int a, int b) {
                    return a - b;
                }

                public static double divisionNumbers(double a, double b) {
                    try {
                        return a / b;
                    } catch (ArithmeticException e) {
                        e.printStackTrace();
                    }
                    return 0;
                }

                public static int multNumbers(int a, int b) {
                    return a * b;
                }
            }
        }


