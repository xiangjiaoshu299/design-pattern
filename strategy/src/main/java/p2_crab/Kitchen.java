package p2_crab;

public class Kitchen {

    private CrabCooking crabCooking;

    public CrabCooking getCrabCooking() {
        return crabCooking;
    }

    public void setCrabCooking(CrabCooking crabCooking) {
        this.crabCooking = crabCooking;
    }

    public void cookingMethod(){
        this.crabCooking.cookingMethod();
    }
}
