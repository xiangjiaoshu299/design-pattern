package p2_parlour;

public class ConcreteDecorator2 extends Decorator{
    public void buildWall() {
        parlour.setWall("墙类别2");
    }

    public void buildTv() {
        parlour.setTv("电视品牌2");
    }

    public void buildSofa() {
        parlour.setSofa("沙发品牌2");
    }
}
