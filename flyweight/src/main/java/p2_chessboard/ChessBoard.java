package p2_chessboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChessBoard extends MouseAdapter {

    private Graphics _graphics;
    int FIRST_POINT_X = 50;//棋盘左上角第一个点的坐标
    int FIRST_POINT_Y = 50;
    int GRID_W = 40;//棋盘一个小格子的宽度
    int Board_W = 400;//棋盘的宽度

    ChessPiecesFactory _factory = new ChessPiecesFactory();
    JRadioButton _white = null;
    JRadioButton _black = null;

    public ChessBoard() {
        JFrame f = new JFrame("享元模式在五子棋中的运用");
        f.setBounds(100, 100, 500, 550);//（100，,10）是距离屏幕左上角的点
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel centerPanel = new JPanel();
        JPanel southPanel = new JPanel();

        centerPanel.setLayout(null);//这个不设置貌似也正常
        centerPanel.setSize(500, 500);//这个不设置貌似也正常，而且设置200和500没区别
        centerPanel.addMouseListener(this);
        f.add("South", southPanel);
        f.add("Center", centerPanel);//如果不设置，就看不到这个panel在哪了。注意：这个Center一定是大写开头。

        drawRadioBtns(southPanel);//注意：要在sleep之前添加按钮组，否则不显示

        try {
            Thread.sleep(500);//这里一定要停顿一会，不然线就不会画出来，可能是因为这个时候panel还没有添加到jframe里面去吧
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        drawChessBoardLine(centerPanel);
    }

    private void drawRadioBtns(JPanel sourcePanel) {
        _white = new JRadioButton("白子");
        _black = new JRadioButton("黑子", true);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(_white);
        buttonGroup.add(_black);

        sourcePanel.add(_white);
        sourcePanel.add(_black);
    }

    private void drawChessBoardLine(JPanel centerPanel) {
        _graphics = centerPanel.getGraphics();
        _graphics.setColor(Color.BLUE);

        //画边界
        _graphics.drawRect(50, 50, 400, 400);//边界，从panel的（50,50）这个点开始绘制

        //画竖线
        for (int i = 1; i < 10; i++) {
            int point1X = FIRST_POINT_X + i * GRID_W;//50+1*40 -> 50+9*40，x从90->410，边界的x是从50->450，正常
            int point1Y = FIRST_POINT_X;
            int point2X = point1X;
            int point2Y = point1Y + Board_W;
            _graphics.drawLine(point1X, point1Y, point2X, point2Y);
        }

        //画横线
        for (int i = 1; i < 10; i++) {
            int point1X = FIRST_POINT_X;
            int point1Y = FIRST_POINT_Y + i * GRID_W;
            int point2X = point1X + Board_W;
            int point2Y = point1Y;
            _graphics.drawLine(point1X, point1Y, point2X, point2Y);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //testDownPieces(e);

        Point point = e.getPoint();
        point = new Point(point.x - 15, point.y - 15);

        if (_white.isSelected()){
            Pieces pieces = _factory.getPieces(ChessPiecesFactory.WHITE);
            pieces.downPieces(_graphics, point);
        }else{
            Pieces pieces = _factory.getPieces(ChessPiecesFactory.BLACK);
            pieces.downPieces(_graphics, point);
        }
    }

    /**
     * 测试下棋的方法
     */
    private void testDownPieces(MouseEvent e) {
        Point point = e.getPoint();

        int x = point.x - 15;//计算棋子的左上角坐标
        int y = point.y - 15;
        int chessPiecesWidth = 30;
        _graphics.fillOval(x, y, chessPiecesWidth, chessPiecesWidth);//在指定点填充一个圆形
    }
}
