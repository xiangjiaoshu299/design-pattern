package p2_estate;

public class Buyer extends Customer {

    public Buyer(String name) {
        super(name);
        drawUi(350, 100);
    }

    @Override
    public void send(String msg) {
        //更新ui
        receiveArea.append("我(买家)说：" + msg + "\n");
        //更新滚动条
        receiveArea.setCaretPosition(sendText.getText().length());

        this.getMediator().relay(name, msg);
    }

    @Override
    public void receive(String form, String msg) {
        //更新ui
        receiveArea.append(form +  "说：" + msg + "\n");
        //更新滚动条
        receiveArea.setCaretPosition(sendText.getText().length());
    }
}
