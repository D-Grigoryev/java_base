package OOP.presenter;

import OOP.model.Human.Gender;
import OOP.model.Human.Human;
import OOP.model.Service.Service;
import OOP.view.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addHuman(String name, String surname, LocalDate birthday, Gender gender) {
        service.addHuman(name, surname, birthday, gender);
    }

    public void sortByAge() {
        service.sortByAge();
        view.printAnsver(service.getInfo());
    }

    public void getElement() {
        view.printAnsver(service.getInfo());
    }

    public void sortByName() {
        service.sortByName();
        view.printAnsver(service.getInfo());
    }
}
