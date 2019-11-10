package p2_parlour;

import util.ReadXml;

public class Main {

    public static void main(String[] args){

        Decorator decorator = (Decorator) ReadXml.getObject("decorateName");

        ProjectManager pm = new ProjectManager(decorator);
        Parlour parlour = pm.construct();
        parlour.show();
    }
}
