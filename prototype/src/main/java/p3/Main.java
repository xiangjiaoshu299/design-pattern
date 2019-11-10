package p3;

//奖状
class Citation implements Cloneable{
    private String name;
    private String info;
    private String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Citation clone() {
        try {
            System.out.println("奖状复制成功");
            return (Citation) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void display() {
        System.out.println(this.name + ", " + this.info + ", " + this.college);
    }
}

public class Main {
    public static void main(String[] args){
        Citation c1 = new Citation("小明", "羽毛球比赛中获得二等奖", "宜春学院");
        c1.display();
        Citation c2 = c1.clone();
        c2.setName("小红");
        c2.display();
    }
}
