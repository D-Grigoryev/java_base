package lesson_4;

import java.util.LinkedList;
import java.util.Scanner;

//        2 *. Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
//        Это задание повышенной сложности, для решения задачи потребуется создать класс-обертку над LinkedList, например:
//class MyQueue {
//    private LinkedList elements = new LinkedList();
//
//    public MyQueue() { }
//    public MyQueue(LinkedList linkedList) {
//        this.elements = linkedList;
//    }
//
//        .........
//
//}

public class task_2 {
    LinkedList link = new LinkedList();
    public void creatList() {

        System.out.println("Создание спска, если хотете закончить, надмите ENTER без ввода значнеия");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите значение: ");
            String str = sc.nextLine();
            if (str.isEmpty()) {
                System.out.println("Конец подпрограммы");
                break;
            }
            link.add(str);
        }
    }
    public void enqueue(Object o){
        link.addLast(o);
    }
    public Object dequeue(){
        return link.remove(0);
    }
    public Object first(){
        return link.getFirst();
    }

    public static void main(String[] args) {
        task_2 t = new task_2();
        t.creatList();
        System.out.println("Элементы созданного LinkedList: "+t.link);
        t.enqueue(77);
        System.out.println("Добавлен элемент в конец очереди: "+t.link);
        System.out.println("Результат работы метода который возвращает и удаляет первый элемент из очереди: "+t.dequeue());
        System.out.println("Элементы LinkedList после удаления первого элемента: "+t.link);
        System.out.println("Результат работы метода который возвращает  первый элемент из очереди без удаления: "+t.first());
        System.out.println("Элменты LinkedList после работы предыдущего метода: "+t.link);

            }
        }


