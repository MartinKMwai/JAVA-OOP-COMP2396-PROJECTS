import java.awt.Color;

public class CircleTester {
    public static void main(String[] args){
        Circle circle = new Circle(Color.GREEN, true, 0, 0, 0);
        circle.setVertices(50);

        //Testing all Circle Parameters

        System.out.println("Circle color: " + circle.color);
        System.out.println("Circle filled: "+ circle.filled);
        System.out.println("Circle theta: "+ circle.theta);
        System.out.println("Circle centre: ("+circle.xc +"' "+ circle.yc + ")");
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " +circle.getPerimeter());
        int[] x = circle.getX();
        System.out.println("Quadrant bounding the circle, x vertices: " + java.util.Arrays.toString(x));
        int[] y = circle.getY();
        System.out.println("Quadrant bounding the circle, y vertices: " + java.util.Arrays.toString(y));

    }
}
