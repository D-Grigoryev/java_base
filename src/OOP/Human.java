package OOP;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable{
    private String name, surname;
    private String birthday;
    private Human mother, father;
    private List<Human> children;
    private Gender gender;

    public Human(String name, String surname, String birthday, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
        this.children = new ArrayList<>();
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
            return "\nИмя: " + name + " " + "\nФамилия: " + surname + "\nДата рождения: " + birthday +
                    "\nПол: " + gender + "\nРодители: " + "\nМать: " + mother.name + " " + mother.surname + "\n"
                    +"Отец: " + father.name + " " + father.surname + "\n" + str;
        }
        else if (mother == null && father!=null){
            return "\nИмя: " + name + " " + "\nФамилия: " + surname + "\nДата рождения: " + birthday +
                    "\nПол: " + gender + "\nРодители: " + "\nМать: Нет сведений" + "\nОтец: " + father.name + " " + father.surname + "\n" + str;
        }
        else if (father == null && mother!=null) {
            return "\nИмя: " + name + " " + "\nФамилия: " + surname + "\nДата рождения: " + birthday +
                    "\nПол: " + gender + "\nРодители: " + "\nМать: " + mother.name + " " + mother.surname + "\nОтец: Нет сведений"+ "\n" + str;
        }
        return "\nИмя: " + name + " " + "\nФамилия: " + surname + "\nДата рождения: " + birthday +
                "\nПол: " + gender + "\nРодители: " + "\nМать: Нет сведений" + "\nОтец: Нет сведений"+ "\n" + str;
    }

}
