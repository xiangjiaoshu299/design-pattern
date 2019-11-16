package p1;

public class Main {

    public static void main(String[] args){
        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();

        ObjStructure objStructure = new ObjStructure();
        objStructure.add(elementA);
        objStructure.add(elementB);

        Visitor visitorA = new ConcreteVisitorA();
        objStructure.accept(visitorA);

        System.out.println("----------------------------");

        ConcreteVisitorB visitorB = new ConcreteVisitorB();
        objStructure.accept(visitorB);
    }
}
