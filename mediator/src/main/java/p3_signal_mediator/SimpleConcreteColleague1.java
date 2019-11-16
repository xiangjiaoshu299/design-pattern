package p3_signal_mediator;

public class SimpleConcreteColleague1 implements SimpleColleague {

    @Override
    public void send() {
        System.out.println("具体同事1，发出请求");
        SimpleMediator mediator = SimpleConcreteMediator.getMediator();
        mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事1，收到请求");
    }
}
