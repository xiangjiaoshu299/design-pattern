package p3_signal_mediator;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){
        SimpleMediator mediator = SimpleConcreteMediator.getMediator();
        SimpleConcreteColleague1 colleague1 = new SimpleConcreteColleague1();
        SimpleConcreteCollerague2 collerague2 = new SimpleConcreteCollerague2();

        mediator.register(colleague1);
        mediator.register(collerague2);

        colleague1.send();
        System.out.println("------------------------");
        collerague2.send();
    }
}
