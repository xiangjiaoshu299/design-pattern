package p2_approval;

import p1.Handler;

public class Main {

    public static void main(String[] args){
        Leader classAdviser = new ClassAdviser();
        Leader departmentHand = new DepartmentHand();
        Leader dean = new Dean();

        classAdviser.setNext(departmentHand);
        departmentHand.setNext(dean);

        classAdviser.handRequest(8);
    }
}
