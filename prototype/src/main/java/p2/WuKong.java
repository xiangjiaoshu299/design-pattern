package p2;

import javax.swing.*;

public class WuKong extends JPanel implements Cloneable {

    public WuKong() {
        System.out.println("加载图片...");
        this.add(new JLabel(new ImageIcon("src/main/resources/Wukong.jpg")));
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
