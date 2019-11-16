package p2_material;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MaterialWinApp extends JFrame implements ItemListener {

    MaterialSet materialSet = null;
    ArtCompany artCompany = null;
    MintCompany mintCompany = null;

    JPanel imgPanel = null;
    JRadioButton artBtn = null;
    JRadioButton mintBtn = null;

    public static void main(String[] args) {
        new MaterialWinApp();
    }

    public MaterialWinApp() {
        super("利用访问者模式设计艺术公司和铸币公司");

        materialSet = new MaterialSet();
        materialSet.add(new Cuprum());
        materialSet.add(new Paper());

        artCompany = new ArtCompany();
        mintCompany = new MintCompany();
        String accept = materialSet.accept(artCompany);
        drawUi(accept);
    }

    public void drawUi(String accept) {


        this.setBounds(50, 50, 750, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imgPanel = new JPanel();
        JPanel ctlPanel = new JPanel();

        //控件
        artBtn = new JRadioButton("艺术公司", true);
        mintBtn = new JRadioButton("铸币公司");
        artBtn.addItemListener(this);
        mintBtn.addItemListener(this);
        ButtonGroup group = new ButtonGroup();
        artBtn.addItemListener(this);
        mintBtn.addItemListener(this);
        group.add(artBtn);
        group.add(mintBtn);
        ctlPanel.add(artBtn);
        ctlPanel.add(mintBtn);

        //面板添加
        this.add("Center", imgPanel);
        this.add("South", ctlPanel);

        showImg(accept);
    }

    private void showImg(String accept) {

        String[] split = accept.split(" ");
        String imgName1 = split[0];
        String imgName2 = split[1];

        imgPanel.removeAll();
        imgPanel.repaint();

        JLabel lb1 = new JLabel(new ImageIcon("src/main/resources/" + imgName1 + ".jpg"));
        JLabel lb2 = new JLabel(new ImageIcon("src/main/resources/" + imgName2 + ".jpg"));
        imgPanel.add(lb1);
        imgPanel.add(lb2);

        this.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton source = (JRadioButton) e.getSource();
        boolean selected = source.isSelected();
        if (selected) {
            if(source.equals(artBtn)){
                String accept = materialSet.accept(artCompany);
                showImg(accept);
            }else if(source.equals(mintBtn)){
                String accept = materialSet.accept(mintCompany);
                showImg(accept);
            }
        }
    }
}
