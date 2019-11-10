package p4_factory;

public class Main {

    public static void main(String[] args){
        PrototypeFactory factory = new PrototypeFactory();
        factory.addPrototype("圆形", new Circle());
        factory.addPrototype("正方形", new Square());

        int r = 2;

        Shape circle= factory.getPrototype("圆形");
        circle.countArea(2);

        Shape square = factory.getPrototype("正方形");
        square.countArea(2);
    }
}
