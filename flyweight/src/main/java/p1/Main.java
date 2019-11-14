package p1;

public class Main {

    public static void main(String[] args){
        FlyweightsFactory factory = new FlyweightsFactory();
        Flyweight a1 = factory.getFlyweight("a");
        Flyweight a2 = factory.getFlyweight("a");
        Flyweight a3 = factory.getFlyweight("a");
        Flyweight b1 = factory.getFlyweight("b");
        Flyweight b2 = factory.getFlyweight("b");

        a1.operation(new UnSharedConcreteFlyweight("第一次调用a"));
        a2.operation(new UnSharedConcreteFlyweight("第二次调用a"));
        a3.operation(new UnSharedConcreteFlyweight("第三次调用a"));
        b1.operation(new UnSharedConcreteFlyweight("第三次调用b"));
        b2.operation(new UnSharedConcreteFlyweight("第三次调用b"));
    }
}
