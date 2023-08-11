package OOP.Comparators;
import OOP.FamilyTree.FamyilyTreeItems;
import OOP.Human.Human;

import java.util.Comparator;

public class ComparatorByAge<T extends FamyilyTreeItems> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
