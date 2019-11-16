package p1;

public class ConcreateColleague1 extends Colleague {
    public void send() {
        this.getMediator().relay(this);
    }

    public void receive() {
        System.out.println("具体同事1，收到请求");
    }
}
