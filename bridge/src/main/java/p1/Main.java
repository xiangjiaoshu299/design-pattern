package p1;

public class Main {

    public static void main(String[] args){
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new RefinedAbstration(implementor);
        abstraction.operation();
    }
}
