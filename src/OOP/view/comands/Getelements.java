package OOP.view.comands;

import OOP.view.ConsoleUI;

public class Getelements extends Commands{
    public Getelements(ConsoleUI consoleUI) {
        super("Получение списка членов семьи", consoleUI);
    }

    public void execute (){
        super.getConsoleUI().getElement();

    }
}
