package p3_composite_command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command{

    private List<Command> list = new ArrayList<Command>();

    public void add(Command command){
        list.add(command);
    }

    public void remove(Command command){
        list.remove(command);
    }

    public Command get(int i){
        return list.get(i);
    }

    public void execute() {

        list.forEach(c -> c.execute());
    }
}
