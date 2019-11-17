package p2_breakfast;

import javax.swing.*;

public class HunDunChef extends JFrame implements Chef {

    public HunDunChef(){
        super("混沌");

        JLabel jLabel = new JLabel(new ImageIcon("src/main/resources/HunTun.jpg"));
        this.add(jLabel);
        this.setLocation(900, 100);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public void cooking() {
        System.out.println("做混沌");
        this.setVisible(true);
    }
}
