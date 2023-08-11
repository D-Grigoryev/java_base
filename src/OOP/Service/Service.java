package OOP.Service;

import OOP.FamilyTree.FamilyTree;
import OOP.FamilyTree.FamyilyTreeItems;
import OOP.Filehendler.Filehendler;
import OOP.Human.Gender;
import OOP.Human.Human;

import java.time.LocalDate;

public class Service{

    public void setFamilyTree(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    private FamilyTree<Human> familyTree;
    private Filehendler filehendler;

    public Service() {
        this.familyTree = new FamilyTree();
    }

    public void addHuman (int id, String name, String surname, LocalDate birthday, Gender gender, Human father, Human mother){
        familyTree.addFamylytee(new Human(id,name,surname,birthday,gender, father, mother));
    }
    public Human getHuman (int id) {
        for (Human h : familyTree) {
            if (h.getId() == id) {
                return h;};
        }
        return null;
    }
    public String getInfo(){
        return familyTree.getInfo();
    }
    public FamilyTree getFamilyTree() {
        return familyTree;
    }
    public void sortByName(){
        familyTree.sortByName();
    }
    public void sortByAge(){
        familyTree.sortByAge();
    }

}


