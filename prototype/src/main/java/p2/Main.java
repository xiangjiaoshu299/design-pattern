package p2;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(1, 2));
        Container contentPane = frame.getContentPane();

        WuKong w1 = new WuKong();
        contentPane.add(w1);

        WuKong w2 = w1.clone();
        contentPane.add(w2);

        frame.pack();
        contentPane.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
