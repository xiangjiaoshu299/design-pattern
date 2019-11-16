package p2_material;

//铜
public class Cuprum implements Material {

    @Override
    public String accept(Company visitor) {
        return visitor.create(this);
    }
}
