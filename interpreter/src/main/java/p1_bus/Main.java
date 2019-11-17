package p1_bus;

public class Main {

/*文法规则
  <expression> ::= <city>的<person>
  <city> ::= 韶关|广州
  <person> ::= 老人|妇女|儿童
*/

    public static void main(String[] args){
        Context bus = new Context();
        bus.freeRide("韶关的儿童");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的老人");
        bus.freeRide("深圳的老人");

    }
}
