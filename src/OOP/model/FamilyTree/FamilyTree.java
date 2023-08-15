package OOP.model.FamilyTree;

import OOP.model.Comparators.ComparatorByAge;
import OOP.model.Comparators.ComparatorByName;
import OOP.model.Comparators.SortPeaple;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends FamyilyTreeItems<E>> implements Serializable, Iterable<E>{
    List<E> famylytree;

    public FamilyTree() {
        famylytree = new ArrayList<>();
    }

    public void addFamylytee(E obj) {
        this.famylytree.add(obj);


    }

    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Члены семьи:\n ");
        for (E obj: famylytree){
            stringBuilder.append(obj);
            stringBuilder.append("\n");
            stringBuilder.append("--------------------------");
        }
        return stringBuilder.toString();
    }

    public void setMother(E human) {
       human.setMother(human);
    }
    public void setFather(E human) {
        human.setFather(human);
    }
    public void addChildren(E human) {
        human.addChildren(human);
    }

    @Override
    public Iterator<E> iterator() {
        return new SortPeaple(famylytree);
    }
    public void sortByName() {
        famylytree.sort(new ComparatorByName<>());
    }

    public void sortByAge() {
        famylytree.sort(new ComparatorByAge<>());
    }

}
