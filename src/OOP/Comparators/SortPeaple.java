package OOP.Comparators;

import OOP.Human.Human;


import java.util.Iterator;
import java.util.List;

public class SortPeaple implements Iterator<Human> {
    int index;
    List<Human> famylytree;

    public SortPeaple(List<Human> famylytree) {
        this.famylytree= famylytree;
    }

    @Override
    public boolean hasNext() {
        return famylytree.size() > index;
    }

    @Override
    public Human next() {
        return famylytree.get(index++);
    }
}
