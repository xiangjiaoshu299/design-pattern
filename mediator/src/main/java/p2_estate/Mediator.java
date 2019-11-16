package p2_estate;

public interface Mediator {

    void register(Customer customer);
    void relay(String form, String msg);
}
