package p2_wife;

//发起人
public class Player {
    private String wifeName;

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public Girl createMemento(){
        return new Girl(wifeName);
    }

    public void restoreMemento(Girl girl){
        this.wifeName = girl.getName();
    }
}
