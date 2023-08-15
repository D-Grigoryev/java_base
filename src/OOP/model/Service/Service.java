package OOP.model.Service;

import OOP.model.FamilyTree.FamilyTree;
import OOP.model.Filehendler.Filehendler;
import OOP.model.Human.Gender;
import OOP.model.Human.Human;

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

    public void addHuman (String name, String surname, LocalDate birthday, Gender gender){
        familyTree.addFamylytee(new Human(name,surname,birthday,gender));
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


