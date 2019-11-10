package p4_factory;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    Map<String, Shape> prototypes = new HashMap<String, Shape>();

    public void addPrototype(String name, Shape shape){
        prototypes.put(name, shape);
    }

    public Shape getPrototype(String name){
        //调用制定对象的复制方法
        return (Shape) prototypes.get(name).clone();
    }
}
