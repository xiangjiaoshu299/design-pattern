package p3_prototype_momento;

public class OriginatorPrototype implements Cloneable {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public OriginatorPrototype createMemento(){
        return this.clone();
    }

    public void restoreMemento(OriginatorPrototype originatorPrototype){
        this.state = originatorPrototype.getState();
    }

    @Override
    protected OriginatorPrototype clone() {
        try {
            return (OriginatorPrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
