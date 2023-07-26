package OOP;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable
{
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
}
