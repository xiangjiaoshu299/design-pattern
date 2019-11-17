package p1_bus;

import java.util.HashSet;
import java.util.Set;

//终结符表达式
public class TerminalExpress implements AbstractExpress{

    private Set<String> set = new HashSet<String>();

    public TerminalExpress(String[] arr) {
        for (String s : arr) {

            if(!set.contains(s)){
                set.add(s);
            }
        }
    }

    public boolean interpreter(String info) {

        return set.contains(info);
    }
}
