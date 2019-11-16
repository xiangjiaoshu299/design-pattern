package p2_approval;


//班主任
public class ClassAdviser extends Leader {
    @Override
    public void handRequest(int leaveDays) {
        if(leaveDays <= 2){
            System.out.println("班主任允许你请" + leaveDays + "天");
        }else{
            Leader next = this.getNext();
            if(null != next){
                next.handRequest(leaveDays);
            }else{
                System.out.println("没有人批注这个请假条");
            }
        }
    }
}
