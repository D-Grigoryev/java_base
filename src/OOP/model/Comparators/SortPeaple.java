package OOP.model.Comparators;

import OOP.model.FamilyTree.FamyilyTreeItems;


import java.util.Iterator;
import java.util.List;

public class SortPeaple <T extends FamyilyTreeItems<T>> implements Iterator<T> {
    int index;
    List<T> famylytree;

    public SortPeaple(List<T> famylytree) {
        this.famylytree= famylytree;
    }

    @Override
    public boolean hasNext() {
        return famylytree.size() > index;
    }

    @Override
    public T next() {
        return famylytree.get(index++);
    }
}
