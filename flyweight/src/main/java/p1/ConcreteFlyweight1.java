package p1;

public class ConcreteFlyweight1 implements Flyweight {

    private String key;

    public ConcreteFlyweight1(String key){
        this.key = key;
        System.out.println("具体享元对象1-" + key + "被创建");
    }

    public void operation(UnSharedConcreteFlyweight unShared) {
        System.out.print("具体向原对象1-" + key + "被调用，");
        System.out.println("非享元信息：" + unShared.getInfo());
    }
}
