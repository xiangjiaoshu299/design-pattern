package p1;

import java.util.ArrayList;
import java.util.List;

public interface Mediator {

    void register(Colleague colleague);
    void relay(Colleague colleague);
}
