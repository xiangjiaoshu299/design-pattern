package p1;

//注意：p1包下面的案例，是透明形式的组合模式
public interface Component {

    public void add(Component component);
    public void remove(Component component);
    public void get(int i);
    public void operation();
}
