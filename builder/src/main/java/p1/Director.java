package p1;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        builder.bulidPartA();
        builder.bulidPartB();
        builder.bulidPartC();

        Product result = builder.getResult();
        return result;
    }
}
