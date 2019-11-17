package p1;

public class Main {

    public static void main(String[] args){
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);

        System.out.println("客户端访问调用者的call()方法！");
        invoker.call();
    }
}
