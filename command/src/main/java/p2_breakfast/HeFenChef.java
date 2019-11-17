package p2_breakfast;

import javax.swing.*;

public class HeFenChef extends JFrame implements Chef{

    public HeFenChef(){
        super("河粉");

        JLabel jLabel = new JLabel(new ImageIcon("src/main/resources/HeFen.jpg"));
        this.add(jLabel);
        this.setLocation(500, 100);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void cooking() {
        System.out.println("做河粉");
        this.setVisible(true);
    }
}
