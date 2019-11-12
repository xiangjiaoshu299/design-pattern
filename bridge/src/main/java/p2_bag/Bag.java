package p2_bag;

public abstract class Bag {

    protected Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract String getName();
}
