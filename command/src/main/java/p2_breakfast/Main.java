package p2_breakfast;

public class Main {

    public static void main(String[] args){

		Waiter waiter = new Waiter();
        ChangFen changFen = new ChangFen();
        HeFen heFen = new HeFen();
        HunDun hunDun = new HunDun();

        //设置命令
        waiter.setBreakfast1(changFen);
        waiter.setBreakfast2(heFen);
        waiter.setBreakfast3(hunDun);

        waiter.chooseBreakfast1();
        waiter.chooseBreakfast2();
        waiter.chooseBreakfast3();

    }
}
