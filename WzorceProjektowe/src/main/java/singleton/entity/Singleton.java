package singleton.entity;

public class Singleton {

    private static Singleton uniqInstance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqInstance == null) {
            System.out.println("--> Create Singleton instance!");
            uniqInstance = new Singleton();
        }
        return uniqInstance;
    }
}
