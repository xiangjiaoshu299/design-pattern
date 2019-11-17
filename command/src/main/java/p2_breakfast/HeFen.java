package p2_breakfast;

public class HeFen implements Breakfast {
    private Chef chef = null;

    public HeFen() {
        chef = new HeFenChef();
    }

    public void cooking() {
        chef.cooking();
    }
}
