package adapter;

import adapter.control.Duck;
import adapter.control.TurkeyAdapter;
import adapter.entity.DuckImpl;
import adapter.entity.TurkeyImpl;

public class Main {

    public static void main() {

        System.out.println("====== ADAPTER ======");

        Duck duck = new DuckImpl();
        Duck turkey = new TurkeyAdapter(new TurkeyImpl());

        duck.quacking();
        turkey.quacking();

        System.out.println();
    }
}
