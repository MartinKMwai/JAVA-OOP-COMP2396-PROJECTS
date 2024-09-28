import java.awt.Color;

public class SquareTester {
    public static void main(String[] args){
        Square square = new Square(Color.RED, true, 0, 0, 0);
        square.setVertices(50);

//Testing all the square parameters
        System.out.println("Square Color: " + square.color);
        System.out.println("Square filled: " + square.filled);
        System.out.println("Square theta: " + square.theta);
        System.out.println("Square centre (x, y): (" + square.xc +", "+square.yc +")");
        System.out.println("Square area: "+ square.getArea());
        System.out.println("Square perimeter: "+ square.getArea());
        int[] x = square.getX();
        System.out.println("Square vertex x: "+ java.util.Arrays.toString(x));
        int[] y = square.getY();
        System.out.println("Square vertex y: "+ java.util.Arrays.toString(y));


    }
}


