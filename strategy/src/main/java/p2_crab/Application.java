package p2_crab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Application implements ItemListener {

    private JRadioButton steamedLabel = null;
    private JRadioButton braisedLabel = null;
    JFrame jFrame = null;
    JPanel centerJPanel = null;
    private Kitchen kitchen = null;

    public Application(){
        kitchen = new Kitchen();

        jFrame = new JFrame();
        jFrame.setBounds(100, 100, 500, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);//固定高度，不然下面的按钮组就不能显示
        jFrame.setVisible(true);

        steamedLabel = new JRadioButton("清蒸大闸蟹");
        braisedLabel = new JRadioButton("红烧大闸蟹");
        steamedLabel.addItemListener(this);
        braisedLabel.addItemListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(steamedLabel);
        group.add(braisedLabel);

        JPanel southJPanel = new JPanel();
        southJPanel.add(steamedLabel);
        southJPanel.add(braisedLabel);

        centerJPanel = new JPanel();
        jFrame.add("Center", centerJPanel);
        jFrame.add("South", southJPanel);
    }
    
    public static void main(String[] args){
        new Application();
    }

    public void itemStateChanged(ItemEvent e) {
        JRadioButton jRadioButton= (JRadioButton) e.getSource();

        if(jRadioButton.equals(steamedLabel)){
            SteamedCrab steamedCrab = new SteamedCrab();
            kitchen.setCrabCooking(steamedCrab);
            kitchen.cookingMethod();

        }else if(jRadioButton.equals(braisedLabel)){
            BraisedCrab braisedCrab = new BraisedCrab();
            kitchen.setCrabCooking(braisedCrab);
            kitchen.cookingMethod();
        }

        centerJPanel.removeAll();
        centerJPanel.add((Component) kitchen.getCrabCooking());
        centerJPanel.repaint();
        jFrame.setVisible(true);
    }
}
