package p2_chessboard;

import java.awt.*;

public interface Pieces {

    //下棋。这2个参数，充当非享元信息
    void downPieces(Graphics g, Point point);
}
