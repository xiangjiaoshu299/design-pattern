package p1;

/**
 * 拓展抽象类
 */
public class RefinedAbstration extends Abstraction {


    public RefinedAbstration(Implementor implementor) {
        super(implementor);
    }

    public void operation() {
        System.out.println("拓展抽象类，操作");
        implementor.operation();
    }
}
