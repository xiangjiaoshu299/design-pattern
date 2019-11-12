package p2_speciality;

public class SgProxy implements Specialty {

    WySpecialty wySpecialty = new WySpecialty();

    public void display() {

        preRequest();
        wySpecialty.display();
        postRequest();
    }

    private void postRequest() {
        System.out.println("韶关代理婺源特产，结束");
    }

    private void preRequest() {
        System.out.println("韶关代理婺源特产，开始");
    }
}
