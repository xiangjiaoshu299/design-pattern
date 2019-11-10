package p1_cloneable;

class RealizableType implements Cloneable{
    public RealizableType(){
        System.out.println("实现类，创建成功");
    }

    @Override
    protected RealizableType clone() {
        System.out.println("实现类，拷贝");
        try {
            return (RealizableType) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class Main {

    public static void main(String[] args){
        RealizableType r1 = new RealizableType();
        RealizableType r2 = r1.clone();

        System.out.println("两个对象是否相等：" + (r1 == r2));
    }
}
