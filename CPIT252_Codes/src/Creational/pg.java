package Creational;

/**
 *
 * @author Mjed
 */
public class pg {

    public static void main(String[] args) {
        // TODO code application logic here
        // Singilton eager
        Singleton_Eager_Initialization sei_1 = Singleton_Eager_Initialization.getInstance();
        Singleton_Eager_Initialization sei_2 = Singleton_Eager_Initialization.getInstance();
        System.out.println(sei_1.hashCode() + " - " + sei_2.hashCode());
        // Singilton lazy
        Singleton_Lazy_Initialization sli_1 = Singleton_Lazy_Initialization.getInstance();
        Singleton_Lazy_Initialization sli_2 = Singleton_Lazy_Initialization.getInstance();
        System.out.println(sli_1.hashCode() + " - " + sli_2.hashCode());
    }

}
