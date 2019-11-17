package p2_breakfast;

public class ChangFen implements Breakfast {

    private Chef chef;

    public ChangFen() {
        this.chef = new ChangFenChef();
    }

    public void cooking() {
        chef.cooking();
    }
}
