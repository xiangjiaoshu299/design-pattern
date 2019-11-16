package p2_estate;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){
        
		Mediator mediator = new EstateMediator();
		Customer c1 = new Seller("张三（卖方）");
		Customer c2 = new Buyer("李四（买方）");
		mediator.register(c1);
		mediator.register(c2);
    }


}
