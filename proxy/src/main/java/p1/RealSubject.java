package p1;

//真是主题
public class RealSubject implements Subject {
    public void request() {
        System.out.println("访问真实主题方法");
    }
}
