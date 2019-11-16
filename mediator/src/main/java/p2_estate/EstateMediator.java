package p2_estate;

import java.util.ArrayList;
import java.util.List;

public class EstateMediator implements Mediator {

    private List<Customer> list = new ArrayList<>();

    @Override
    public void register(Customer customer) {

        if(!list.contains(customer)){
            customer.setMediator(this);
            list.add(customer);
        }
    }

    @Override
    public void relay(String form, String msg) {
        list.forEach(customer -> {
            if(!customer.getName().equals(form)){
                customer.receive(form, msg);
            }
        });
    }
}
