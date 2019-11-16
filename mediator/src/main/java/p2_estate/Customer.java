package p2_estate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Customer extends JFrame implements ActionListener {

    protected String name;
    private Mediator mediator;

    //控件
    JTextField sendText = null;
    JTextArea receiveArea = null;

    public Customer(String name) {
        super(name);//调用jframe的构造，可以设置窗口的title
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void send(String msg);

    public abstract void receive(String form, String msg);

    protected void drawUi(int x, int y) {
        Container contentPane = this.getContentPane();
        JScrollPane scrollPane = null;
        JPanel receivePanel = null;
        JPanel sendPanel = null;

        //控件
        sendText = new JTextField(18);
        sendText.addActionListener(this);
        receiveArea = new JTextArea(10, 18);
        receiveArea.setEditable(false);

        //接受消息面板
        receivePanel = new JPanel();
        receivePanel.setBorder(BorderFactory.createTitledBorder("接收内容"));
        receivePanel.add(receiveArea);
        //接受消息的滚动面板
        scrollPane = new JScrollPane(receivePanel);
        contentPane.add(scrollPane, BorderLayout.NORTH);

        //发送面板
        sendPanel = new JPanel();
        sendPanel.setBorder(BorderFactory.createTitledBorder("发送内容"));
        sendPanel.add(sendText);
        contentPane.add(sendPanel, BorderLayout.SOUTH);

        //显示
        this.setSize(250, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(x, y);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //清空发送栏
        String msg = sendText.getText().trim();
        sendText.setText("");

        //发送消息
        this.send(msg);
    }
}
