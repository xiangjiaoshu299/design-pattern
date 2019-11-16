package p2_wy_scenic_spot;

//景点聚合接口
public interface ScenicSpotSet {

    void add(ScenicSpot scenicSpot);
    void remove(ScenicSpot scenicSpot);
    ScenicSpotIterator getIterator();
}
