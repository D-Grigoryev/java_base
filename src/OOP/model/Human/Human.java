package OOP.model.Human;

import OOP.model.FamilyTree.FamyilyTreeItems;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable, FamyilyTreeItems<Human> {
    private int id = -1;
    private String name, surname;
    private LocalDate birthday;
    private Human mother, father;
    private List<Human> children;
    private Gender gender;


    public Human(String name, String surname, LocalDate birthday, Gender gender) {
        this.id = id++;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
        this.children = new ArrayList<>();
//        this.father = father;
//        this.mother = mother;
        id++;
    }


    public String getName() {
        return name;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public int getId() {
        return id;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    public int getAge (){
        Period diff = Period.between(getBirthday(), LocalDate.now());
        return diff.getYears();
    }


    public void setMother(Human mother) {
        this.mother = mother;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public void addChildren(Human human) {
        children.add(human);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String str;
        for (Human child: this.children) {
            if (child!=null) {
                stringBuilder.append("Дети: " + child.name + " " + child.surname + " ");
                stringBuilder.append("\n");
            }
        }
        str = String.valueOf(stringBuilder);
        if (mother !=null && father !=null) {
            return "\nНомер: "+ id +"\nИмя: " + name + " " + "\nФамилия: " + surname + "\nДата рождения: " + birthday +"\nВозраст: " + getAge() +
                    "\nПол: " + gender + "\nРодители: " + "\nМать: " + mother.name + " " + mother.surname + "\n"
                    +"Отец: " + father.name + " " + father.surname + "\n" + str;
        }
        else if (mother == null && father!=null){
            return "\nНомер: "+ id +"\nИмя: " + name + " " + "\nФамилия: " + surname + "\nДата рождения: " + birthday +"\nВозраст: " + getAge() +
                    "Номер: "+ id +"\nПол: " + gender + "\nРодители: " + "\nМать: Нет сведений" + "\nОтец: " + father.name + " " + father.surname + "\n" + str;
        }
        else if (father == null && mother!=null) {
            return "\nНомер: "+ id +"\nИмя: " + name + " " + "\nФамилия: " + surname + "\nДата рождения: " + birthday +"\nВозраст: " + getAge() +
                    "\nПол: " + gender + "\nРодители: " + "\nМать: " + mother.name + " " + mother.surname + "\nОтец: Нет сведений"+ "\n" + str;
        }
        return "\nНомер: "+ id +"\nИмя: " + name + " " + "\nФамилия: " + surname + "\nДата рождения: " + birthday + "\nВозраст: " + getAge() +
                "\nПол: " + gender + "\nРодители: " + "\nМать: Нет сведений" + "\nОтец: Нет сведений"+ "\n" + str;
    }

}
