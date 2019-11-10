package p2;

import javax.swing.*;

public class WuKong extends JPanel implements Cloneable {

    public WuKong() {
        this.add(new JLabel(new ImageIcon("src/Wukong.jpg")));
    }

    @Override
    protected WuKong clone() {
        try {
            System.out.println("复制悟空成功！");
            return (WuKong) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
