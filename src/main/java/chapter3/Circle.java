package chapter3;

/**
 * Created by bobby on 1/22/2017.
 */
public class Circle {
    private int xPos, yPos, radius;
    // Default constructors initializing all the three fields
    public Circle(){
        xPos = 20;
        yPos = 20;
        radius = 10;
    }

    // Overriden toString method to print info on a Circle object in string form
    public String toString(){
        return "Center = (" + xPos + "," + yPos + ") and radius = " +radius;
    }
    public static void main(String []s){
        //Passing an object to println automatically invokes toString method
        System.out.println(new Circle());
    }

}
