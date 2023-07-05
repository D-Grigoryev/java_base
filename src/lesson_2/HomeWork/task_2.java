package lesson_2.HomeWork;
import java.util.Arrays;
import java.io.*;

//        2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class task_2 {
        public static void main(String[] args) {
           try (FileWriter writer = new FileWriter("log.txt", true)){


               int[] mas = {11, 3, 14, 16, 7};

               boolean isSorted = false;
               int buf;
               while (!isSorted) {
                   isSorted = true;
                   for (int i = 0; i < mas.length - 1; i++) {
                       if (mas[i] > mas[i + 1]) {
                           isSorted = false;
                           buf = mas[i];
                           mas[i] = mas[i + 1];
                           mas[i + 1] = buf;
                           writer.write("Итерация - " + (i+1) + " результат - " + String.valueOf(mas[i])+"\n");
                       }
                   }
               }
               writer.write("Конец цикла\n");
               System.out.println(Arrays.toString(mas));
           }catch (Exception e){
               e.printStackTrace();
           }
        }
    }

