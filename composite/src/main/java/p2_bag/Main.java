package p2_bag;

public class Main {

    public static void main(String[] args) {
        Bag redSmallBag = new Bag("红色小袋子");

        Bag whiteSmallBag = new Bag("白色小袋子");
        Bag middleBag = new Bag("中袋子");
        Bag bigBag = new Bag("大袋子");

        Goods goods = null;
        goods = new Goods("婺源特产", 2, 7.9);
        redSmallBag.add(goods);
        goods = new Goods("婺源地图", 1, 9.9);
        redSmallBag.add(goods);

        goods = new Goods("韶关香籍", 2, 68);
        whiteSmallBag.add(goods);
        goods = new Goods("韶关红茶", 3, 180);
        whiteSmallBag.add(goods);

        middleBag.add(redSmallBag);
        goods = new Goods("景德镇瓷器", 1, 380);
        middleBag.add(goods);

        bigBag.add(middleBag);;
        bigBag.add(whiteSmallBag);
        goods = new Goods("李宁牌运动鞋", 1, 198);
        bigBag.add(goods);

        System.out.println("您选购的全部商品有：");
        bigBag.show();
        double sum = bigBag.calculation();
        System.out.println("你需要支付的总金额：" + sum);
    }
}
