package p1;

public class Main {

    public static void main(String[] args){
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("S0");
        System.out.println("当前状态：" + originator.getState());

        //开启备份
        caretaker.setMemento(originator.createMemento());

        //变化
        originator.setState("S1");
        System.out.println("更换后的状态：" + originator.getState());

        //恢复
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复后，状态：" + originator.getState());
    }
}
