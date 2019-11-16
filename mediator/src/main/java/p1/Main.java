package p1;

public class Main {

    public static void main(String[] args){
        Mediator mediator = new ConcreteMediator();
        Colleague c1 = new ConcreateColleague1();
        Colleague c2 = new ConcreateColleague2();

        mediator.register(c1);
        mediator.register(c2);

        c1.send();
        System.out.println("-----------------");
        c2.send();
    }
}
