package p2_chessboard;

import java.awt.*;

public class BlackPieces implements Pieces {
    @Override
    public void downPieces(Graphics g, Point point) {
        g.setColor(Color.BLACK);
        g.fillOval(point.x, point.y, 30, 30);
    }
}
