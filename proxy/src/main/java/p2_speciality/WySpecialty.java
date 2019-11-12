package p2_speciality;

import javax.swing.*;
import java.awt.*;

public class WySpecialty extends JFrame implements Specialty {

    public WySpecialty(){
        this.setLayout(new GridLayout(1, 1));
        this.add(new JLabel(new ImageIcon("src/main/resources/WuyuanSpecialty.jpg")));
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void display() {
        this.setVisible(true);
    }
}
