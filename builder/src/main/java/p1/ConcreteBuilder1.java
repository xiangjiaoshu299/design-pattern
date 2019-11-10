package p1;

public class ConcreteBuilder1 extends Builder {
    public void bulidPartA() {
        System.out.println("制造部分A");
        product.setPartA("a1");
    }

    public void bulidPartB() {
        System.out.println("制造部分B");
        product.setPartB("b1");
    }

    public void bulidPartC() {
        System.out.println("制造部分C");
        product.setPartC("c1");
    }
}
