package OOP.model.Comparators;
import OOP.model.FamilyTree.FamyilyTreeItems;

import java.util.Comparator;

public class ComparatorByName<T extends FamyilyTreeItems> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
