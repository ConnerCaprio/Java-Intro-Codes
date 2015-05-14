

package simpleclass;

/**
 *
 * @author doublec
 */
public class SimpleClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Building b = new Building(10, 8, "skyscraper");
        
        System.out.println("Name: " + b.getName());
        System.out.println("Height: " + b.getHeight());
        System.out.println("Width: " + b.getWidth());
        System.out.println("Perimeter: " + b.getPerimeter());
        System.out.println("Area: " + b.getArea());
    }
    
}
