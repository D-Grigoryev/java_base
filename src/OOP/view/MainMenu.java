package OOP.view;

import OOP.view.comands.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    List<Commands> commands;

    public MainMenu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new AddElement(consoleUI));
        commands.add(new Getelements(consoleUI));
        commands.add(new Sortbyage(consoleUI));
        commands.add(new Sortbyname(consoleUI));
        commands.add(new Finish(consoleUI));
    }

    public String menu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public void execute (int numCommand){
        Commands command = commands.get(numCommand -1);
        command.execute();

    }
}
