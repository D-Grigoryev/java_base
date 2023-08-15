package OOP.view.comands;

import OOP.view.ConsoleUI;

public abstract class Commands {
    private String description;

    ConsoleUI getConsoleUI() {
        return consoleUI;
    }

    private ConsoleUI consoleUI;

    public Commands(String description, ConsoleUI consoleUI) {
        this.description = description;
        this.consoleUI = consoleUI;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}
