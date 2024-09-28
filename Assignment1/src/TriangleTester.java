import java.awt.Color;

public class TriangleTester {
    public static void main(String[] args){
        Triangle triangle = new Triangle(Color.BLUE, true, 0, 0, 0);
        triangle.setVertices(50);

        //testing all triangle parameters

        System.out.println("Triangle color: "+ triangle.color);
        System.out.println("Triangle filled: "+ triangle.filled);
        System.out.println("Triangle theta: "+ triangle.theta);
        System.out.println("Triangle centre: (" + triangle.xc +", "+triangle.yc + ")");
        System.out.println("Triangle area: "+ triangle.getArea());
        System.out.println("Triangle perimeter: " +triangle.getPerimeter());
        int[] x = triangle.getX();
        System.out.println("Triangle vertices x: " +java.util.Arrays.toString(x));
        int[] y = triangle.getY();
        System.out.println("Triangle vertices y: " +java.util.Arrays.toString(y));

    }
}
