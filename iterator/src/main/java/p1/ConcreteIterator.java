package p1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator{

    private List list = new ArrayList<Object>();
    private int index = -1;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    public boolean hasNext() {
        return index < list.size() - 1;
    }

    public Object next() {

        if(hasNext()){
            return list.get(++index);
        }

        return null;
    }

    public Object first() {
        index = 0;
        Object o = list.get(index);
        return o;
    }
}
