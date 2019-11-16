package p2_material;

//艺术公司公司
public class ArtCompany implements Company{
    @Override
    public String create(Cuprum cuprum) {
        return "朱熹铜像";
    }

    @Override
    public String create(Paper paper) {
        return "讲学图";
    }
}
