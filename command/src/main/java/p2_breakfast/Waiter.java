package p2_breakfast;

//服务员（调用者）
public class Waiter {

    private Breakfast breakfast1, breakfast2, breakfast3;

    public void setBreakfast1(Breakfast breakfast1) {
        this.breakfast1 = breakfast1;
    }

    public void setBreakfast2(Breakfast breakfast2) {
        this.breakfast2 = breakfast2;
    }

    public void setBreakfast3(Breakfast breakfast3) {
        this.breakfast3 = breakfast3;
    }

    public void chooseBreakfast1(){
        breakfast1.cooking();
    }
    public void chooseBreakfast2(){
        breakfast2.cooking();
    }
    public void chooseBreakfast3(){
        breakfast3.cooking();
    }
}
