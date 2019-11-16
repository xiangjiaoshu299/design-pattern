package p2_material;

public class Paper implements Material {

    @Override
    public String accept(Company visitor) {
        return visitor.create(this);
    }
}
