package p1;

import java.util.ArrayList;
import java.util.List;

public class ObjStructure {
    private List<Element> list = new ArrayList<Element>();

    public void add(Element element){
        this.list.add(element);
    }

    public void remove(Element element){
        this.list.remove(element);
    }

    public void accept(Visitor visitor){
        list.forEach(ele -> {
            ele.accept(visitor);
        });
    }
}
