package p1;

/**
 * 叶子节点
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void add(Component component) {
        //不实现
    }

    public void remove(Component component) {
        //不实现
    }

    public void get(int i) {
        //不实现
    }

    public void operation() {
        System.out.println("节点 " + name + "被访问！");
    }
}
