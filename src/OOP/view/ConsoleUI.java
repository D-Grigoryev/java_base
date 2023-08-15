package OOP.view;

import OOP.model.Human.Gender;
import OOP.presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Presenter presenter;
    private Scanner scanner;
    private MainMenu mainMenu;
    private boolean work;


    public ConsoleUI() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
        mainMenu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Добро пожаловать в программу Семейное Древо");
        while (work){
            System.out.println(mainMenu.menu());
            String choice = scanner.nextLine();
            //метод проверки на валидность дописать
            int choiceInt = Integer.parseInt(choice);
            mainMenu.execute(choiceInt);
        }
    }

    private void errorInput() {
        System.out.println("Введено неверное значение");
    }

    public void fisnish() {
        scanner.close();
        work = false;
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getElement() {
        presenter.getElement();
    }

    public void addElement(){
//        System.out.println("Введите id члена семьи");
//        int id = Integer.parseInt(scanner.nextLine());
        //метод проверки на валидность дописать
        System.out.println("Введите имя члена семьи");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию члена семьи");
        String surname = scanner.nextLine();
        System.out.println("Введите дату рождения члена семьи через пробелы(в формате год, месяц, день)");
        String date = scanner.nextLine();
        LocalDate birthday = LocalDate.of(Integer.parseInt(date.split(" ")[0]),
                Integer.parseInt(date.split(" ")[1]), Integer.parseInt(date.split(" ")[2]));
        System.out.println("Укажите пол члена семьи (Male/Famale)");
        String gender= scanner.nextLine();
//        Дописать методы добавления родителей
        presenter.addHuman(name, surname, birthday, Gender.valueOf(gender));

    }
    @Override
    public void printAnsver(String text) {
        System.out.println(text);
    }
}
