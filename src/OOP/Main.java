package OOP;

import OOP.Human.Human;
import OOP.Service.Service;

import java.time.LocalDate;

import static OOP.Human.Gender.Famale;
import static OOP.Human.Gender.Male;

//        Продолжаем грейдить наш проект с гениологическим древом. Изменить древо, сделать класс параметизированным,
//        чтобы условно дерево можно было использовать не только для людей,
//        но и сделать родословную для собак(класс собак создавать не надо или создать, но за пределами пакета проекта).
//        Продумать(только подумать, но можно и попробовать реализовать) класс общения с пользователем, набор команд,
//        для операций над деревом
public class Main {
    public static void main(String[] args){
    Service service = new Service();

    service.addHuman(0,"Олег","Иванов", LocalDate.of(1986,5,23), Male,
            null, null);
    service.addHuman(1,"Ольга", "Иванова", LocalDate.of(1994,8,01), Famale,
            null, null);
    service.addHuman(2,"Ирина", "Иванова", LocalDate.of(2010,7,15), Famale,
            service.getHuman(0), service.getHuman(1));

     System.out.println(service.getInfo());
     service.sortByAge();
     System.out.println(service.getInfo());
     service.sortByName();
     System.out.println(service.getInfo());

//    Сериализация
//    Filehendler filehendler = new Filehendler("save.out");
//    filehendler.saveFile(service.getFamilyTree());

//    Десериаллизация
//        Filehendler filehendler1 = new Filehendler("save.out");
//        service.setFamilyTree ((FamilyTree) filehendler1.loadFile("save.out"));
//        System.out.println("После сохранение: " + service.getFamilyTree().getInfo());
    }
}
