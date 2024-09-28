import java.awt.Color;

/**
 * Circle class models circle shape.
 */
public class Circle extends Shape {

    /**
     * Default constructor for Circle.
     */
    public Circle(){
        super(Color.GREEN, true, 0, 0, 0, new double[2], new double[2]);
    }

    /**
     * @param color color of circle
     * @param filled whether circle is filled or not
     * @param theta orientation of circle in radians
     * @param xc x-coordinate of center of circle
     * @param yc y-coordinate of center of circle
     */
    public Circle(Color color, boolean filled, double theta, double xc, double yc){
        super(color, filled, theta, xc, yc, new double[2], new double[2]);

    }

    //overriding setVertices() method from shape class
    @Override
    public void setVertices(double d){
        yLocal = new double[]{-d, d};
        xLocal = new double[]{-d, d};
    }
    //overriding getArea() method from shape class
    @Override
    public double getArea(){
        double radius = xLocal[1];
        return Math.PI * radius * radius;
    }
    //overriding getPerimeter() method from shape class
    @Override
    public double getPerimeter(){
        double radius = xLocal[1];
        return 2 * Math.PI * radius;
    }
    //overriding getX() method from shape class
    @Override
    public int[] getX(){
        double[] xCanvas = new double[2];
        xCanvas[0] = xLocal[0] +xc;
        xCanvas[1] = xLocal[1] +xc;
        int[] xInt = new int[2];
        xInt[0] = (int) Math.round(xCanvas[0]);
        xInt[1] = (int) Math.round(xCanvas[1]);
        return xInt;

    }
    //overriding getY() method from shape class
    public int[] getY(){
        double[] yCanvas = new double[2];
        yCanvas[0] = yLocal[0] + yc;
        yCanvas[1] = yLocal[1] + yc;
        int[] yInt = new int[2];
        yInt[0] = (int) Math.round(yCanvas[0]);
        yInt[1] = (int) Math.round(yCanvas[1]);
        return yInt;

    }



}
