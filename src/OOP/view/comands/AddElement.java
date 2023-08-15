package OOP.view.comands;

import OOP.view.ConsoleUI;

public class AddElement  extends Commands{

    public AddElement(ConsoleUI consoleUI) {
        super("Добавить челна семьи", consoleUI);
    }

    public void execute (){
       super.getConsoleUI().addElement();

    }
}
