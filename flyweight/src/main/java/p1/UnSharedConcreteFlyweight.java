package p1;

/**
 * 非共享类
 */
public class UnSharedConcreteFlyweight {

    private String info;

    public UnSharedConcreteFlyweight(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
