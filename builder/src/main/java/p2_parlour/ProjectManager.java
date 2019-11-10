package p2_parlour;

public class ProjectManager {
    private Decorator decorator;

    public ProjectManager(Decorator decorator){
        this.decorator = decorator;
    }

    public Parlour construct(){
        decorator.buildWall();
        decorator.buildTv();
        decorator.buildSofa();

        return decorator.getResult();
    }
}
