package p2_wy_scenic_spot;

import java.util.ArrayList;
import java.util.List;

//婺源景点具体聚合类
public class WyScenicSpontSet implements  ScenicSpotSet{

    private List<ScenicSpot> list = new ArrayList<ScenicSpot>();

    public void add(ScenicSpot scenicSpot) {
        if(!list.contains(scenicSpot)){
            this.list.add(scenicSpot);
        }
    }

    public void remove(ScenicSpot scenicSpot) {
        this.list.remove(scenicSpot);
    }

    public ScenicSpotIterator getIterator() {
        return new WyScenicSpotIterator(list);
    }
}
