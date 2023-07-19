package lesson_4;
//3. В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию.
//        Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

        try {
            File file = new File("log.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            int result = 0;
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите первое число: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите операцию (+ - * /): ");
                char op = scanner.nextLine().charAt(0);
                System.out.print("Введите второе число: ");
                int b = Integer.parseInt(scanner.nextLine());
                switch (op) {
                    case '+':
                        System.out.println(a + " + " + b + " = " + add(a, b));
                        fileWriter.write(a + " + " + b + " = " + add(a, b) + '\n');
                        result = add(a, b);
                        break;
                    case '-':
                        System.out.println(a + " - " + b + " = " + minus(a, b));
                        fileWriter.write(a + " - " + b + " = " + minus(a, b) + '\n');
                        result = minus(a, b);
                        break;
                    case '*':
                        System.out.println(a + " * " + b + " = " + multi(a, b));
                        fileWriter.write(a + " * " + b + " = " + multi(a, b) + '\n');
                        result = multi(a, b);
                        break;
                    case '/':
                        System.out.println(a + " / " + b + " = " + divide(a, b));
                        fileWriter.write(a + " / " + b + " = " + divide(a, b) + '\n');
                        result = divide(a, b);
                        break;
                    default:
                        System.out.println("Wrong operation!");
                        break;
                }
                fileWriter.flush();
                System.out.println("Если хотите продолжить введите /go, елси хотите закончить введите /end, " +
                        "если хотате отменить предыдущу операцию введите /del");
                String str = scanner.nextLine();
                if ("/end".equals(str)) {
                    System.out.println("Программа завершена");
                    break;
                } else if ("/del".equals(str)) {
                    System.out.println("Результать предыдущей операции: " + result);
                    System.out.println("Вы действительно хотите удаить предыдущий результат: Y/N");
                    String s = scanner.nextLine();
                    if (s.equals("Y")) {
                        fileWriter.write(result + " Удален" + '\n');
                        System.out.println("Результат успешно удален");
                        result = 0;
                        continue;
                    }
                    if (s.equals("N")) {
                        System.out.println("Операция по удаленю отменена");
                        fileWriter.write("Операция по удалению отменена" + '\n');
                        continue;
                    }
                    continue;

                } else if ("go".equals(str)) {
                    continue;

                }
                fileWriter.flush();
                fileWriter.close();
            }

        }
        catch(Exception e){
            System.out.println("Исключение при работе с файлом.");
        }
    }
        private static int divide ( int a, int b){
            if (b != 0) return a / b;
            return -1;
        }

        private static int multi ( int a, int b){
            return a * b;
        }

        private static int minus ( int a, int b){
            return a - b;
        }

        private static int add ( int a, int b){
            return a + b;
        }
    }


