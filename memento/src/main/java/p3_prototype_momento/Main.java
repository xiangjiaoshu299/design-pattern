package p3_prototype_momento;



//原型模式+备忘录模式
public class Main {

    public static void main(String[] args){
        OriginatorPrototype originator = new OriginatorPrototype();
        PrototypeCaretaker caretaker = new PrototypeCaretaker();

        originator.setState("S0");
        System.out.println("当前状态：" + originator.getState());

        //备份
        caretaker.setOriginatorPrototype(originator.createMemento());

        //更换状态
        originator.setState("S1");
        System.out.println("更换状态后：" + originator.getState());

        //恢复状态
        originator.restoreMemento(caretaker.getOriginatorPrototype());
        System.out.println("恢复状态后：" + originator.getState());
    }
}
