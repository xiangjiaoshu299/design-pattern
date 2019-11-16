package p1;

import java.util.ArrayList;
import java.util.List;

public class ConcreAggregate implements Aggregate{

    private List list = new ArrayList<Object>();

    public void add(Object o) {
        this.list.add(o);
    }

    public void remove(Object o) {
        this.list.remove(o);
    }

    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
