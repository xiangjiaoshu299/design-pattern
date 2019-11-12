package p1;

public class Proxy implements Subject {

    private RealSubject realSubject;

    public void request() {

        if (null == realSubject) {
            realSubject = new RealSubject();
        }

        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("访问真实主题方法前的预处理");
    }

    private void postRequest() {
        System.out.println("访问真实主题方法前的后续处理");
    }
}
