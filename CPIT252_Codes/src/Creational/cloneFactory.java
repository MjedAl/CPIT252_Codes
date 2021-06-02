
package Creational;

/**
 *
 * @author Mjed
 */
public class cloneFactory {
    public Animal getClone(Animal animalSample){
        return animalSample.makeCopy();
    }
}
