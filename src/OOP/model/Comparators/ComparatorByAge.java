package OOP.model.Comparators;
import OOP.model.FamilyTree.FamyilyTreeItems;

import java.util.Comparator;

public class ComparatorByAge<T extends FamyilyTreeItems<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
