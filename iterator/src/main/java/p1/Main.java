package p1;

public class Main {

    public static void main(String[] args){
        Aggregate list = new ConcreAggregate();
        list.add("中山大学");
        list.add("华南理工");
        list.add("韶关学院");

        Iterator iterator = list.getIterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.print(next + ", ");
        }

        Object first = iterator.first();
        System.out.println("\n第一个元素：" + first);
    }
}
