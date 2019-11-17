package p1;

public class ConcreteCommand implements Command {

    Receiver receiver = null;

    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    public void execute() {
//        System.out.println("具体命令，执行");
        receiver.action();
    }
}
