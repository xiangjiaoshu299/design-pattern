package p1;

public class Invoker {

    Command command = null;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        System.out.println("调用者，执行命令command！");
        command.execute();
    }
}
