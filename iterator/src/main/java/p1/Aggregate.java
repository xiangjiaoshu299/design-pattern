package p1;

//聚合类
public interface Aggregate{

    void add(Object t);
    void remove(Object t);
    Iterator getIterator();
}
