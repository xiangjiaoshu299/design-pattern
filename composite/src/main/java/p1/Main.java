package p1;

public class Main {

    public static void main(String[] args){
        Component root = new Composite();
        root.add(new Leaf("叶子1"));

        Composite rightTree = new Composite();
        root.add(rightTree);

        rightTree.add(new Leaf("叶子2"));
        rightTree.add(new Leaf("叶子3"));

        root.operation();
    }
}
