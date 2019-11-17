package p2_breakfast;

public class HunDun implements Breakfast {
    private Chef chef;

    public HunDun() {
        this.chef = new HunDunChef();
    }

    public void cooking() {
        chef.cooking();
    }
}
