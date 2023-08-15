package OOP.view.comands;

import OOP.view.ConsoleUI;

public class Sortbyage extends Commands{
    public Sortbyage(ConsoleUI consoleUI) {
        super("Сортировка по возрасту списка членов семьи", consoleUI);
    }

    public void execute (){
        super.getConsoleUI().sortByAge();

    }
}
