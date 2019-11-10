package p1;

public abstract class Builder {
    protected Product product = new Product();

    public abstract void bulidPartA();
    public abstract void bulidPartB();
    public abstract void bulidPartC();

    public Product getResult(){
        return product;
    }
}
