package p1;

import java.util.HashMap;
import java.util.Map;

//注意：这里因为没有第二个具体享元类，工厂都是返回具体享元1的对象
public class FlyweightsFactory {

    private Map<String, Flyweight> flyweightMap = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key){
        if(flyweightMap.containsKey(key)){
            System.out.println("享元对象" + key + "已存在，返回这个对象");
            return flyweightMap.get(key);
        }else{
            flyweightMap.put(key, new ConcreteFlyweight1(key));
            return flyweightMap.get(key);
        }
    }
}
