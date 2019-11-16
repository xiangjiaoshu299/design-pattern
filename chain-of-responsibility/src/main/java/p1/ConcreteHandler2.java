package p1;

public class ConcreteHandler2 extends Handler{
    @Override
    public void handRequest(String request) {
        if("two".equals(request)){
            System.out.println("具体处理者2处理消息：" + request);
        }else{
            Handler next = this.getNext();
            if(next != null){
                next.handRequest(request);
            }else{
                System.out.println("没有人处理消息了！");
            }
        }
    }
}
