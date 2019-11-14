package p1;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点
 */
public class Composite implements Component{

    private List<Component> list = new ArrayList<Component>();

    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        component.remove(component);
    }

    public void get(int i) {
        list.get(i);
    }

    public void operation() {
        list.forEach(c -> c.operation());
    }
}
