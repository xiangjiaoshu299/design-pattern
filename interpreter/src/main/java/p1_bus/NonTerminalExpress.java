package p1_bus;


//非终结符表达式
public class NonTerminalExpress implements AbstractExpress {
    private AbstractExpress cityExpress;
    private AbstractExpress personExpress;

    public NonTerminalExpress(AbstractExpress cityExpress, AbstractExpress personExpress) {
        this.cityExpress = cityExpress;
        this.personExpress = personExpress;
    }

    public boolean interpreter(String info) {
        String[] arr = info.split("的");

        boolean cityOk = cityExpress.interpreter(arr[0]);
        boolean personOk = personExpress.interpreter(arr[1]);

        return cityOk && personOk;
    }
}
