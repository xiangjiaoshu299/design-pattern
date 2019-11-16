package p1;

public class ConcreateColleague2 extends Colleague{
    @Override
    public void send() {
        getMediator().relay(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事2，收到请求");
    }
}
