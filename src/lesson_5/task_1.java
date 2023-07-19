package lesson_5;
import java.util.*;


public class task_1 {
//     Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

        private String name;
        private Integer phone;
        private List<task_1> listbook = new ArrayList<>();
        Map<String, Object> hpbook = new HashMap<>();

        task_1 (){
        }
        task_1 (String name, Integer phone){
            this.name=name;
            this.phone=phone;
        }
        public String getName(){
            return this.name;
        }
        public Integer getPhone(){
            return this.phone;
        }
        public void add(String name, Integer phone) {
            List <Integer> lis = new ArrayList<>();
            listbook.add(new task_1(name, phone));
            for (task_1 t: listbook) {
                if (name.equals(t.name)){
                    lis.add(phone);
                }
                hpbook.put(name, lis);
            }



        }
        public void get(String name) {
            List <Integer> listph = new ArrayList<>();
            for (task_1 p: listbook) {
                if (name.equals(p.name)){
                    listph.add(p.phone);
                }
            }
            System.out.println("По фамилии: "+ name+" есть следующие номера: "+listph);
        }

            public void printInfo(){
//            for (task_1 el: listbook) {
//                System.out.println(el.getName() + " " + el.getPhone());
//            }
                for (Map.Entry<String, Object> el: hpbook.entrySet()) {
                    System.out.println(el.getKey()+" "+el.getValue());
                }
        }


        public static void main(String[] args) {
            task_1 t = new task_1();
            t.add("Иванов", 23123123);
            t.add("Иванов", 56787687);
            t.add("Иванов", 83213311);
            t.add("Сидоров", 76546456);
            t.get("Иванов");
            t.printInfo();
        }
    }

