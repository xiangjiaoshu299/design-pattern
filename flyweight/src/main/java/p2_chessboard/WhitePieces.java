package p2_chessboard;

import java.awt.*;

public class WhitePieces implements Pieces{
    @Override
    public void downPieces(Graphics g, Point point) {
        g.setColor(Color.WHITE);
        g.fillOval(point.x, point.y, 30, 30);
    }
}
