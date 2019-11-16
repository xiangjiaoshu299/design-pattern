package p1;

public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationB(){
        System.out.println("具体元素B的操作");
    }
}
