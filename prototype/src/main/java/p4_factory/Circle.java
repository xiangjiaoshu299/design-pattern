package p4_factory;

public class Circle implements Shape {

    public void countArea(int r) {
        System.out.println("圆的面积：" + 3.14 * r * r);
    }

    public Circle clone() {
        try {
            System.out.println("圆拷贝成功");
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
