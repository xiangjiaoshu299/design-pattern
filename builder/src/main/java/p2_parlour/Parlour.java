package p2_parlour;

/**
 * 客厅
 */
public class Parlour {

    private String wall;
    private String tv;
    private String sofa;

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void show(){
        System.out.println("客厅：" + wall + ", " + tv + ", " + sofa);
    }
}
