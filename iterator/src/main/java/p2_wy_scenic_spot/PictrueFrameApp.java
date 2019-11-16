package p2_wy_scenic_spot;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

//相框类
public class PictrueFrameApp extends JFrame implements ActionListener {

    private ScenicSpotSet scenicSpotSet = null;
    private ScenicSpotIterator iterator = null;

    public static void main(String[] args) {
        new PictrueFrameApp();
    }

    public PictrueFrameApp() {

        scenicSpotSet = new WyScenicSpontSet();
        iterator = scenicSpotSet.getIterator();

        scenicSpotSet.add(new ScenicSpot("江湾", "江湾景区是婺源的一个国家5A级旅游景区，景区内有萧江宗祠、永思街、滕家老屋、婺源人家、乡贤园、百工坊等一大批古建筑，精美绝伦，做工精细。"));
        scenicSpotSet.add(new ScenicSpot("李坑", "李坑村是一个以李姓聚居为主的古村落，是国家4A级旅游景区，其建筑风格独特，是著名的徽派建筑，给人一种安静、祥和的感觉。"));
        scenicSpotSet.add(new ScenicSpot("思溪延村", "思溪延村位于婺源县思口镇境内，始建于南宋庆元五年（1199年），当时建村者俞氏以（鱼）思清溪水而名。"));
        scenicSpotSet.add(new ScenicSpot("晓起村", "晓起有“中国茶文化第一村”与“国家级生态示范村”之美誉，村屋多为清代建筑，风格各具特色，村中小巷均铺青石，曲曲折折，回环如棋局。"));
        scenicSpotSet.add(new ScenicSpot("菊径村", "菊径村形状为山环水绕型，小河成大半圆型，绕村庄将近一周，四周为高山环绕，符合中国的八卦“后山前水”设计，当地人称“脸盆村”。"));
        scenicSpotSet.add(new ScenicSpot("篁岭", "篁岭是著名的“晒秋”文化起源地，也是一座距今近六百历史的徽州古村；篁岭属典型山居村落，民居围绕水口呈扇形梯状错落排布。"));
        scenicSpotSet.add(new ScenicSpot("彩虹桥", "彩虹桥是婺源颇有特色的带顶的桥——廊桥，其不仅造型优美，而且它可在雨天里供行人歇脚，其名取自唐诗“两水夹明镜，双桥落彩虹”。"));
        scenicSpotSet.add(new ScenicSpot("卧龙谷", "卧龙谷是国家4A级旅游区，这里飞泉瀑流泄银吐玉、彩池幽潭碧绿清新、山峰岩石挺拔奇巧，活脱脱一幅天然泼墨山水画。"));

        ScenicSpot first = iterator.first();
        createUi(first);
    }

    private void createUi(ScenicSpot item) {
        String imgName = item.getName();
        String introduce = item.getIntroduce();

        Container contentPane = this.getContentPane();
        JPanel picturePanel = new JPanel();
        JPanel ctlPanel = new JPanel();
        contentPane.add("Center", picturePanel);
        contentPane.add("South", ctlPanel);

        //控件
        ImageIcon imageIcon = new ImageIcon("src/main/resources/" + imgName + ".jpg");
        JLabel lb = new JLabel(imgName, imageIcon, JLabel.CENTER);
        JTextArea ta = new JTextArea(introduce);
        lb.setHorizontalTextPosition(JLabel.CENTER);
        lb.setVerticalTextPosition(JLabel.TOP);
        lb.setFont(new Font("宋体", Font.BOLD, 20));
        ta.setLineWrap(true);//让它可以换行
        ta.setEditable(false);

        //添加
        picturePanel.setLayout(new BorderLayout(5, 5));
        picturePanel.add("Center", lb);
        picturePanel.add("South", ta);

        //按钮
        JButton first, last, next, previous;
        first = new JButton("第一张");
        last = new JButton("最末张");
        next = new JButton("下一张");
        previous = new JButton("上一张");
        first.addActionListener(this);
        last.addActionListener(this);
        next.addActionListener(this);
        previous.addActionListener(this);
        ctlPanel.add(first);
        ctlPanel.add(previous);
        ctlPanel.add(next);
        ctlPanel.add(last);

        this.setSize(630, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String btnName = e.getActionCommand();

        if ("第一张".equals(btnName)) {

            ScenicSpot scenicSpot = iterator.first();
            createUi(scenicSpot);
        }else if("最末张".equals(btnName)){

            ScenicSpot scenicSpot = iterator.last();
            createUi(scenicSpot);
        }else if("上一张".equals(btnName)){

            ScenicSpot scenicSpot = iterator.previous();
            createUi(scenicSpot);
        }else if("下一张".equals(btnName)){

            ScenicSpot scenicSpot = iterator.next();
            createUi(scenicSpot);
        }
    }
}

//江湾","江湾景区是婺源的一个国家5A级旅游景区，景区内有萧江宗祠、永思街、滕家老屋、婺源人家、乡贤园、百工坊等一大批古建筑，精美绝伦，做工精细。
//李坑","李坑村是一个以李姓聚居为主的古村落，是国家4A级旅游景区，其建筑风格独特，是著名的徽派建筑，给人一种安静、祥和的感觉。
//思溪延村","思溪延村位于婺源县思口镇境内，始建于南宋庆元五年（1199年），当时建村者俞氏以（鱼）思清溪水而名。
//晓起村","晓起有“中国茶文化第一村”与“国家级生态示范村”之美誉，村屋多为清代建筑，风格各具特色，村中小巷均铺青石，曲曲折折，回环如棋局。
//菊径村","菊径村形状为山环水绕型，小河成大半圆型，绕村庄将近一周，四周为高山环绕，符合中国的八卦“后山前水”设计，当地人称“脸盆村”。
//篁岭","篁岭是著名的“晒秋”文化起源地，也是一座距今近六百历史的徽州古村；篁岭属典型山居村落，民居围绕水口呈扇形梯状错落排布。
//彩虹桥","彩虹桥是婺源颇有特色的带顶的桥——廊桥，其不仅造型优美，而且它可在雨天里供行人歇脚，其名取自唐诗“两水夹明镜，双桥落彩虹”。
//卧龙谷","卧龙谷是国家4A级旅游区，这里飞泉瀑流泄银吐玉、彩池幽潭碧绿清新、山峰岩石挺拔奇巧，活脱脱一幅天然泼墨山水画。