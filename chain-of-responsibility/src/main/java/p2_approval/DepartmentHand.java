package p2_approval;


public class DepartmentHand extends Leader {
    @Override
    public void handRequest(int leaveDays) {
        if(leaveDays <= 7){
            System.out.println("部门领导批注你请" + leaveDays + "天");
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
