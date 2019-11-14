package p2_bag;

public class Goods implements Article {

    private String name;
    private int quantity;//数量
    private double unitPrice;

    public Goods(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public void show() {
        System.out.println(name + "（" + "数量" + quantity + ", 单价" + this.unitPrice + ")");
    }

    @Override
    public double calculation() {
        return quantity * unitPrice;
    }
}
