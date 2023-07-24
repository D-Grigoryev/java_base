package OOP;

import java.util.List;

import static OOP.Gender.Famale;
import static OOP.Gender.Male;

//Реализовать, с учетом ооп подхода, приложение.
//        Для проведения исследований с генеалогическим древом.
//        Идея: описать некоторое количество компонент, например:
//        модель человека и дерева
//        Под “проведением исследования” можно понимать например получение всех детей выбранного человека.
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


    System.out.println(familyTree.getInfo());
    }
}
