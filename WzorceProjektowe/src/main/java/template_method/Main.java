package template_method;

import template_method.entity.Coffee;
import template_method.entity.Tee;

public class Main {

    public static void main() {
        System.out.println("====== TEMPLATE METHOD ======");
        Tee tee = new Tee();
        tee.make();
        Coffee coffee = new Coffee();
        coffee.make();
        System.out.println();
    }
}
