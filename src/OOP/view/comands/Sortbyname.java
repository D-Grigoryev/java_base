package OOP.view.comands;

import OOP.view.ConsoleUI;

public class Sortbyname extends Commands {

    public Sortbyname(ConsoleUI consoleUI) {
        super("Сортировка по имени членов семьи", consoleUI);
    }

    public void execute() {
        super.getConsoleUI().sortByName();

    }
}

