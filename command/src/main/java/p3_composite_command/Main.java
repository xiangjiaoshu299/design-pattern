package p3_composite_command;

//组合模式，和命令模式相结合（只演示部分操作：组合命令被调用）
public class Main {

    public static void main(String[] args){
        CompositeCommand compositeCommand = new CompositeCommand();

        compositeCommand.add(new ConcreteCommand1());
        compositeCommand.add(new ConcreteCommand2());

        compositeCommand.execute();
    }
}
