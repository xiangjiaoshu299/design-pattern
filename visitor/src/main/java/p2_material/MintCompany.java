package p2_material;

//纸币公司
public class MintCompany implements Company {
    @Override
    public String create(Cuprum cuprum) {
        return "铜币";
    }

    @Override
    public String create(Paper paper) {
        return "纸币";
    }
}
