package p3_composite_command;

public class ConcreteCommand1 implements Command{
    Receiver receiver;

    public ConcreteCommand1(){
        receiver = new Receiver();
    }

    public void execute() {
        receiver.action1();
    }
}
