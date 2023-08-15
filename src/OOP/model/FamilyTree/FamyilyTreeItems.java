package OOP.model.FamilyTree;
import java.time.LocalDate;


public interface FamyilyTreeItems<E> {
    String getName();
    int getAge();
    E getMother();
    E getFather();
    LocalDate getBirthday();
    void setMother(E mother);
    void setFather(E father);
    void addChildren(E human);
}
