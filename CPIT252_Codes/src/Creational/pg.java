package Creational;

/**
 *
 * @author Mjed
 */
public class pg {

    public static void main(String[] args) {
        // TODO code application logic here
        //singleton();
        //prototybe();
        builder();
    }

    private static void singleton() {
        // Singilton eager
        Singleton_Eager_Initialization sei_1 = Singleton_Eager_Initialization.getInstance();
        Singleton_Eager_Initialization sei_2 = Singleton_Eager_Initialization.getInstance();
        System.out.println(sei_1.hashCode() + " - " + sei_2.hashCode());
        // Singilton lazy
        Singleton_Lazy_Initialization sli_1 = Singleton_Lazy_Initialization.getInstance();
        Singleton_Lazy_Initialization sli_2 = Singleton_Lazy_Initialization.getInstance();
        System.out.println(sli_1.hashCode() + " - " + sli_2.hashCode());
    }

    private static void prototybe() {
        //Prototype 
        // why we use clone factory? so we can pass ANY animal and get it's cloned version
        cloneFactory animalCloner = new cloneFactory();
        // First obj
        Sheep katheri = new Sheep("red");
        System.out.println(katheri.hashCode());
        System.out.println(katheri);

        // Cloning the object
        Sheep clonedKatheri = (Sheep) animalCloner.getClone(katheri);
        System.out.println(clonedKatheri.hashCode());
        System.out.println(clonedKatheri);
        // Diffrent hash codes == two diffrent object but they are clonned and have same attrubutes
    }

    private static void builder() {
        PizzaBuilder pb = new PizzaBuilder();
        pb.createNewPizzaProduct();
        pb.buildDough();
        pb.buildSauce();
        pb.buildTopping();
        System.out.println(pb.getPizza());
    }

}
