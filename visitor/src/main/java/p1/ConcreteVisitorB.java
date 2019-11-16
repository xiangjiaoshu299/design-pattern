package p1;

public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.print("访问者B访问->");
        elementA.operationA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.print("访问者B访问->");
        elementB.operationB();
    }
}
