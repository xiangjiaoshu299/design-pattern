package p2_chessboard;

import java.util.HashMap;
import java.util.Map;

public class ChessPiecesFactory {

    public static final String BLACK = "b";
    public static final String WHITE = "w";

    private Map<String, Pieces> map = new HashMap<>();

    public ChessPiecesFactory() {
        map.put(BLACK, new BlackPieces());
        map.put(WHITE, new WhitePieces());
    }

    public Pieces getPieces(String key) {

        if (key.equals(WHITE)) {
            return map.get(WHITE);
        } else if (key.equals(BLACK)) {
            return map.get(BLACK);
        }

        return null;
    }


}