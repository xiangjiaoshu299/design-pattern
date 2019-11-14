package p2_bag;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Article {

    private String name;
    private List<Article> children = new ArrayList<>();

    public Bag(String name) {
        this.name = name;
    }

    @Override
    public void show() {
//        System.out.println(name + "包含：");
        children.forEach(c -> c.show());
    }

    @Override
    public double calculation() {
        double sum = children.stream().mapToDouble(Article::calculation).sum();

        return sum;
    }

    public void add(Article article){
        this.children.add(article);
    }

    public void remove(Article article){
        this.children.remove(article);
    }

    public void get(int i){
        this.children.get(i);
    }
}
