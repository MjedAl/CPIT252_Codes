package Creational;

/**
 *
 * @author Mjed
 */
public class Sheep implements Animal {

    public String color;

    public Sheep(String color) {
        this.color = color;
    }
    
    @Override
    public Animal makeCopy() {
        Sheep sheepObj = null;
        try {
            sheepObj = (Sheep) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sheepObj;
    }

    public String toString() {
        return "Sheep says miaaaa, my color is : "+ this.color;
    }

}
