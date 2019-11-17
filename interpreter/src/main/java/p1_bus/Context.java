package p1_bus;

//环境类。可以传递数据和调用功能
public class Context {

    String[] citys = new String[]{"韶关", "广州"};
    String[] persons = new String[]{"老人", "儿童", "妇女"};

    private NonTerminalExpress cityPersonExpress;

    public Context() {
        TerminalExpress cityExpress = new TerminalExpress(citys);
        TerminalExpress personExpress = new TerminalExpress(persons);
        this.cityPersonExpress = new NonTerminalExpress(cityExpress, personExpress);
    }

    //免费乘车
    public void freeRide(String info){
        boolean ok = cityPersonExpress.interpreter(info);
        if(ok){
            System.out.println("您是" + info + ", 本次坐车免费");
        }else{
            System.out.println(info + ", 不在优惠区间，本次坐车2元");
        }
    }
}
