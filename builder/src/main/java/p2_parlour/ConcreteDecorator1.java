package p2_parlour;

public class ConcreteDecorator1 extends Decorator {
    public void buildWall() {
        parlour.setWall("墙类别1");
    }

    public void buildTv() {
        parlour.setTv("电视品牌1");
    }

    public void buildSofa() {
        parlour.setSofa("沙发品牌1");
    }
}
