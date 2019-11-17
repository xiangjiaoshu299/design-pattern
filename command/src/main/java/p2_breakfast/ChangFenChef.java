package p2_breakfast;

import javax.swing.*;
import java.awt.*;

//做肠粉的厨师（具体命令）
public class ChangFenChef extends JFrame implements Chef{

    public ChangFenChef() {
        super("肠粉");

        JLabel jLabel = new JLabel(new ImageIcon("src/main/resources/ChangFen.jpg"));
        this.add(jLabel);
        this.setLocation(100, 100);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void cooking() {
        System.out.println("做肠粉");
        this.setVisible(true);
    }
}
