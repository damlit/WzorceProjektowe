package singleton;

import singleton.entity.Singleton;

public class Main {

    public static void main() {
        System.out.println("====== SINGLETON ======");
        Singleton firstSingleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();
        System.out.println();
    }
}
