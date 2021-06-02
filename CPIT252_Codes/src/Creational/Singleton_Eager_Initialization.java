package Creational;

/**
 *
 * @author Mjed
 */
public class Singleton_Eager_Initialization {

    private static Singleton_Eager_Initialization instance = new Singleton_Eager_Initialization();

    private Singleton_Eager_Initialization() {
    }

    public static Singleton_Eager_Initialization getInstance() {
        return instance;
    }

}
