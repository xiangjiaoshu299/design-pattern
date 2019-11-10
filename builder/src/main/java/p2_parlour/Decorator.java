package p2_parlour;

/**
 * 装修工人
 */
public abstract class Decorator {

    protected Parlour parlour = new Parlour();

    public abstract void buildWall();
    public abstract void buildTv();
    public abstract void buildSofa();

    public Parlour getResult(){
        return parlour;
    }
}
