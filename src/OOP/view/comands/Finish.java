package OOP.view.comands;

import OOP.view.ConsoleUI;

public class Finish extends Commands {

    public Finish(ConsoleUI consoleUI) {
        super("Завершение работы", consoleUI);
    }

    public void execute() {
        super.getConsoleUI().fisnish();

    }
}

