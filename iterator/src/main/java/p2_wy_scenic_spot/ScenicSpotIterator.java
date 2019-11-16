package p2_wy_scenic_spot;

public interface ScenicSpotIterator {

    boolean hasNext();
    ScenicSpot next();
    ScenicSpot first();
    ScenicSpot last();
    ScenicSpot previous();
}
