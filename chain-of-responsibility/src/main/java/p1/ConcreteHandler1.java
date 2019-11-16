package p1;

import java.util.Optional;

public class ConcreteHandler1 extends Handler {

    public void handRequest(String request) {

        if("one".equals(request)){
            System.out.println("具体处理者1处理消息：" + request);
        }else{
            Handler next = this.getNext();
            if(next != null){
                next.handRequest(request);
            }else {
                System.out.println("没有人处理消息了！");
            }
        }

    }
}
