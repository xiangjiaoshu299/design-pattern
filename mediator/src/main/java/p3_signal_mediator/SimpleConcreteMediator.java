package p3_signal_mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleConcreteMediator implements SimpleMediator {

    private List<SimpleColleague> list = new ArrayList<>();
    private static SimpleMediator mediator = new SimpleConcreteMediator();

    //单例模式
    public static SimpleMediator getMediator() {
        return mediator;
    }

    @Override
    public void register(SimpleColleague colleague) {
        if(!list.contains(colleague)){
            this.list.add(colleague);
        }
    }

    @Override
    public void relay(SimpleColleague colleague) {
        list.forEach(col -> {
            if(!col.equals(colleague)){
                col.receive();
            }
        });
    }
}
