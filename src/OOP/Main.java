package OOP;

import java.util.List;

import static OOP.Gender.Famale;
import static OOP.Gender.Male;

//        В проекте с гениалогическим древом подумайте и используйте интерфейсы.
//        Дополнить проект методами записи в файл и чтения из файла.
//        Для этого создать отдельный класс и реализовать в нем нужные методы.
//        Для данного класса сделайте интерфейс, который и используйте в своей программе.

public class Main {
    public static void main(String[] args) {
    FamilyTree familyTree = new FamilyTree();
    Human human1 = new Human("Олег", "Иванов", "01 мая 1986 года", Male);
    Human human2 = new Human("Ольга", "Иванова", "01 августа 1994 года", Famale);
    Human human3 = new Human("Ирина", "Иванова", "15 июля 2010 года", Famale);

    human2.addChildren(human3);
    human1.addChildren(human3);

    human3.setFather(human1);
    human3.setMother(human2);

    familyTree.addFamylytee(human1);
    familyTree.addFamylytee(human2);
    familyTree.addFamylytee(human3);

    System.out.println("До сохранения: " + familyTree.getInfo());
    //Сериализация
    Filehendler filehendler = new Filehendler("save.out");
    filehendler.saveFile(familyTree);

    //Десериаллизация
//    familyTree = (FamilyTree) filehendler.loadFile("save.out");
//    System.out.println("После сохранение: " + familyTree.getInfo());
    }
}
