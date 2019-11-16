package p1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    protected List<Colleague> colleagues = new ArrayList<Colleague>();

    public void register(Colleague colleague){

        if(!colleagues.contains(colleague)){
            //注意：这是中介者，不用在Colleague的构造函数里面设置
            //，也不要在Main方法里面设置。这是最省力气的方法

            colleague.setMediator(this);
            this.colleagues.add(colleague);
        }
    }

    public void relay(Colleague colleague) {
        colleagues.forEach(c -> {
            if(!c.equals(colleague)){
                c.receive();
            }
        });
    }
}
