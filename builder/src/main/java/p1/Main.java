package p1;

public class Main {

    public static void main(String[] args){
        Builder builder1 = new ConcreteBuilder1();//这个是可配置的
        Director director = new Director(builder1);

        Product product = director.construct();
        product.display();
    }
}
