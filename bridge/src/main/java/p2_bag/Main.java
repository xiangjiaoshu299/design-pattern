package p2_bag;

import util.ReadXml;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){
        Color color = (Color) ReadXml.getObject("p2_bag.", "colorName");
        Bag bag = (Bag) ReadXml.getObject("p2_bag.","bagName");

        bag.setColor(color);
        String bagName = bag.getName();
        System.out.println("包名称：" + bagName);

        show(bagName);
    }

    private static void show(String bagName) {
        JFrame jFrame = new JFrame("桥接者模式创建包");
        jFrame.setLayout(new GridLayout(1, 1));
        Container contentPane = jFrame.getContentPane();
        contentPane.add(new JLabel(new ImageIcon("src/main/resources/" + bagName + ".jpg")));
        jFrame.pack();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
