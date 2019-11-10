package p4_factory;

public class Square implements Shape {

    public void countArea(int r) {
        System.out.println("正方形的面积：" + r * r);
    }

    public Square clone() {
        try {
            System.out.println("正方形拷贝成功");
            return (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
