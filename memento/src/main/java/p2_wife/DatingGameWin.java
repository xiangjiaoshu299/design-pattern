package p2_wife;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DatingGameWin extends JFrame implements ActionListener{

    Player player = null;
    GirlStack girlStack = null;

    JPanel eastJpanel = null;
    JRadioButton girl1 = null;
    JRadioButton girl2 = null;
    JRadioButton girl3 = null;
    JRadioButton girl4 = null;
    JButton okBtn = null;
    JButton backBtn = null;

    public static void main(String[] args){
        new DatingGameWin();
    }

    public DatingGameWin(){
        super("备忘录模式设计相亲游戏");

        player = new Player();
        girlStack = new GirlStack();


        drawUi();
        //更新ui、状态
        updatePicture("空白");
        //备份
        girlStack.push(player.createMemento());
    }

    private void drawUi() {
        this.setBounds(0, 0, 900, 380);
        this.setResizable(false);

        //主面板
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1, 4));
        centerPanel.setBorder(BorderFactory.createTitledBorder("四大美女如下:"));


        //控件
        ImageIcon imageIcon = new ImageIcon("src/main/resources/四大美女.jpg");
        JLabel jLabel = new JLabel(imageIcon, JLabel.CENTER);
        centerPanel.add(jLabel);
        this.add("Center", centerPanel);

        //右边面板
        eastJpanel = new JPanel();
        eastJpanel.setLayout(new GridLayout(1, 1));
        eastJpanel.setBorder(BorderFactory.createTitledBorder("你选择的爱人是："));
        this.add("East", eastJpanel);

        //南边面板
        JPanel southPanel = new JPanel();


        //控件
        JLabel info = new JLabel("四大美女有沉鱼落雁之容，闭月羞花之貌，你选择谁？");
        girl1 = new JRadioButton("西施", true);
        girl2 = new JRadioButton("貂蝉");
        girl3 = new JRadioButton("王昭君");
        girl4 = new JRadioButton("杨玉环");
        okBtn = new JButton("确定");
        backBtn = new JButton("返回");
        ButtonGroup group = new ButtonGroup();
        okBtn.addActionListener(this);
        backBtn.addActionListener(this);
        group.add(girl1);
        group.add(girl2);
        group.add(girl3);
        group.add(girl4);
        southPanel.add(info);
        southPanel.add(girl1);
        southPanel.add(girl2);
        southPanel.add(girl3);
        southPanel.add(girl4);
        southPanel.add(okBtn);
        southPanel.add(backBtn);
        this.add("South", southPanel);
    }

    private void updatePicture(String imgName){
        showPicture(imgName);

        //更新状态
        player.setWifeName(imgName);
    }

    private void showPicture(String imgName) {
        eastJpanel.removeAll();
        eastJpanel.repaint();

        ImageIcon imageIcon = new ImageIcon("src/main/resources/" + imgName + ".jpg");
        JLabel jLabel = new JLabel(imageIcon, JLabel.CENTER);
        eastJpanel.add(jLabel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if(source.equals(okBtn)){
            //备份
            boolean pushOk = girlStack.push(player.createMemento());

            if(pushOk && girl1.isSelected()){
                updatePicture("西施");
            }else if(pushOk && girl2.isSelected()){
                updatePicture("貂蝉");
            }else if(pushOk && girl3.isSelected()){
                updatePicture("王昭君");
            }else if(pushOk && girl4.isSelected()){
                updatePicture("杨玉环");
            }

        }else{
            //恢复状态
            player.restoreMemento(girlStack.pop());//恢复状态
            updatePicture(player.getWifeName());
        }
    }
}
