package p2_approval;

public class Dean extends Leader {
    @Override
    public void handRequest(int leaveDays) {
        if(leaveDays <= 10){
            System.out.println("院长批准你请假" + leaveDays + "天");
        }else{
            Leader next = this.getNext();

            if(next != null){
                next.handRequest(leaveDays);
            }else{
                System.out.println("没有人处理这个请假条");
            }
        }
    }
}
