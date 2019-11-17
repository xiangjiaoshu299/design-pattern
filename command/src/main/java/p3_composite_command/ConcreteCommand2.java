package p3_composite_command;

public class ConcreteCommand2 implements Command{
    Receiver receiver;

    public ConcreteCommand2(){
        receiver = new Receiver();
    }

    public void execute() {
        receiver.action2();
    }
}
