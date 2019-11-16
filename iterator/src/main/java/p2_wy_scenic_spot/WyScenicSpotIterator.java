package p2_wy_scenic_spot;

import java.util.List;

public class WyScenicSpotIterator implements ScenicSpotIterator {
    private List<ScenicSpot> list = null;
    int index = -1;
    ScenicSpot scenicSpot = null;//定义成全局变量，以便找不到下一个的时候，返回最近的对象

    public WyScenicSpotIterator(List<ScenicSpot> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return index < list.size() - 1;
    }

    public ScenicSpot next() {
        if(hasNext()){
            scenicSpot = list.get(++index);
        }

        return scenicSpot;
    }

    public ScenicSpot first() {
        index = 0;
        scenicSpot = list.get(index);
        return scenicSpot;
    }

    public ScenicSpot last() {
        index = list.size() - 1;
        scenicSpot = list.get(index);
        return scenicSpot;
    }

    public ScenicSpot previous() {
        if(index > 0){
            scenicSpot = list.get(--index);
        }

        return scenicSpot;
    }
}
