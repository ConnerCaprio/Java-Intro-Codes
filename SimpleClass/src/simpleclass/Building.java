
package simpleclass;


public class Building {
    
    // Instance variables
    int height, width;
    String name;
    
    // Constructor
    public Building(int width, int height, String name){
        // this.width -> instance variable | width -> passed in
        this.width = width;
        this.height = height;
        this.name = name;
    }

    // Instance methods (public ones can be called by other classes)
    public int getPerimeter(){
        return multiplyBy2(width) + multiplyBy2(height);
    }
    
    public int getArea(){
        return width*height;
    }
    
    // Instance methods (private ones can't be called by other classes)
    private int multiplyBy2(int num){
        return num*2;
    }
    
    // Static method (can be called without making an object)
    public static void displayCommonBuildingNames(){
        String[] names = {"tower", "office", "highrise", "dome"};
        for(String n : names){
            System.out.println(n);
        }
    }
    
    // Getters and Setters (To autogenerate, 
    // right click and hit "Insert Code"->"Getters and Setters"
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
