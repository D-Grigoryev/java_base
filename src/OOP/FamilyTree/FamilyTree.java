package OOP.FamilyTree;

import OOP.Comparators.ComparatorByAge;
import OOP.Comparators.ComparatorByName;
import OOP.Human.Human;
import OOP.Comparators.SortPeaple;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Serializable, Iterable<Human>{
    List<Human> famylytree;

    public FamilyTree() {
        famylytree = new ArrayList<>();
    }

    public void addFamylytee(Human human) {
        this.famylytree.add(human);


    }

    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Члены семьи:\n ");
        for (Human human: famylytree){
            stringBuilder.append(human);
            stringBuilder.append("\n");
            stringBuilder.append("--------------------------");
        }
        return stringBuilder.toString();
    }

    public void setMother(Human human) {
       human.setMother(human);
    }
    public void setFather(Human human) {
        human.setFather(human);
    }
    public void addChildren(Human human) {
        human.addChildren(human);
    }

    @Override
    public Iterator<Human> iterator() {
        return new SortPeaple(famylytree);
    }
    public void sortByName() {
        famylytree.sort(new ComparatorByName());
    }

    public void sortByAge() {
        famylytree.sort(new ComparatorByAge());
    }

}
