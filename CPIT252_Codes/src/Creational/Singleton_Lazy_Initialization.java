package Creational;

/**
 *
 * @author Mjed
 */
public class Singleton_Lazy_Initialization {

    private static Singleton_Lazy_Initialization instance = null;

    private Singleton_Lazy_Initialization() {
    }

    public static Singleton_Lazy_Initialization getInstance() {
        if (instance == null) {
            instance = new Singleton_Lazy_Initialization();
        }
        return instance;
    }

}
