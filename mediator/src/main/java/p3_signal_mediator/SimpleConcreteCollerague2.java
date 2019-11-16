package p3_signal_mediator;

public class SimpleConcreteCollerague2 implements SimpleColleague {
    @Override
    public void send() {
        System.out.println("具体同事2，发出请求");
        SimpleMediator mediator = SimpleConcreteMediator.getMediator();
        mediator.relay(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事2，收到请求");
    }
}
