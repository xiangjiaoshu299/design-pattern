package p1;

public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void display(){
        System.out.println("部分A: " + partA + ", 部分B：" + partB
                + ", 部分C：" + partC);
    }
}
