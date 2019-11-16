package p2_crab;

import javax.swing.*;

public class SteamedCrab extends JLabel implements CrabCooking {

    public void cookingMethod() {
        this.setIcon(new ImageIcon("src/main/resources/SteamedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
