package p2_estate;

import java.awt.event.ActionEvent;

public class Seller extends Customer {

    public Seller(String name) {
        super(name);
        drawUi(50, 100);
    }

    @Override
    public void send(String msg) {
        //更新自己的接受消息面板
        receiveArea.append("我(卖方)说：" + msg + "\n");
        //让滚动条滚动到最下面
        receiveArea.setCaretPosition(sendText.getText().length());

        //转发消息
        getMediator().relay(name, msg);
    }

    @Override
    public void receive(String form, String msg) {
        //更新自己的接受消息面板
        receiveArea.append(form + "说：" + msg+ "\n");
        //让滚动条滚动到最下面
        receiveArea.setCaretPosition(sendText.getText().length());
    }
}
