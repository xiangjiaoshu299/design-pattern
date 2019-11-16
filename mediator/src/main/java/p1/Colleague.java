package p1;

//同事
public abstract class Colleague {

    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send();
    public abstract void receive();
}
