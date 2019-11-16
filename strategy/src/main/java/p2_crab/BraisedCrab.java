package p2_crab;

import javax.swing.*;

public class BraisedCrab extends JLabel implements CrabCooking {

    public void cookingMethod() {
        this.setIcon(new ImageIcon("src/main/resources/BraisedCrabs.jpg"));
//        this.setHorizontalAlignment(CENTER);
    }
}
