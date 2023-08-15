package OOP;

import OOP.model.Service.Service;
import OOP.view.ConsoleUI;
import OOP.view.View;

import java.time.LocalDate;

import static OOP.model.Human.Gender.Famale;
import static OOP.model.Human.Gender.Male;

//        Реализовать паттерн MVP в вашем проекте с семейным деревом. Примеры проектов смотри на 4 и 5 семинаре
public class Main {
    public static void main(String[] args){
        View view = new ConsoleUI();
        view.start();
//    Service service = new Service();
//
//    service.addHuman(0,"Олег","Иванов", LocalDate.of(1986,5,23), Male,
//            null, null);
//    service.addHuman(1,"Ольга", "Иванова", LocalDate.of(1994,8,01), Famale,
//            null, null);
//    service.addHuman(2,"Ирина", "Иванова", LocalDate.of(2010,7,15), Famale,
//            service.getHuman(0), service.getHuman(1));
//
//     System.out.println(service.getInfo());
//     service.sortByAge();
//     System.out.println(service.getInfo());
//     service.sortByName();
//     System.out.println(service.getInfo());

//    Сериализация
//    Filehendler filehendler = new Filehendler("save.out");
//    filehendler.saveFile(service.getFamilyTree());

//    Десериаллизация
//        Filehendler filehendler1 = new Filehendler("save.out");
//        service.setFamilyTree ((FamilyTree) filehendler1.loadFile("save.out"));
//        System.out.println("После сохранение: " + service.getFamilyTree().getInfo());
    }
}
