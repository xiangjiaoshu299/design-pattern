package p2_material;

import java.util.ArrayList;
import java.util.List;

public class MaterialSet {

    private List<Material> list = new ArrayList<>();

    public String accept(Company company){

        String allMaterialName = "";
        for (Material material : list) {
            String accept = material.accept(company);
            allMaterialName += (accept + " ");
        }

        return allMaterialName;
    }

    public void add(Material material){
        this.list.add(material);
    }

    public void remove(Material material){
        this.list.remove(material);
    }

    public Material get(int index){
        return list.get(index);
    }
}
