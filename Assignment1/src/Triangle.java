import java.awt.Color;

/**
 * Triangle class models triangle shape.
 */
public class Triangle extends Shape {

    /**
     * Default constructor for Triangle.
     */
    public Triangle(){
        super(Color.BLUE, true, 0, 0, 0, new double[3], new double[3]);
    }

    /**
     * @param color color of triangle
     * @param filled whether triangle is filled or not
     * @param theta orientation of the triangle in radians
     * @param xc x-coordinate of the center of triangle
     * @param yc y-coordinate of the center of triangle
     */
    public Triangle(Color color, boolean filled, double theta, double xc, double yc) {
        super(color, filled, theta, xc, yc, new double[3], new double[3]);
    }

    //overriding setVertices() method from shape class
    @Override
    public void setVertices(double d){
        double cos60 = Math.cos(Math.PI / 3);
        double sin60 = Math.sin(Math.PI / 3);
        xLocal = new double[]{d, -d*cos60, -d * cos60};
        yLocal = new double[]{0, -d*sin60, d * sin60};

    }
    //overriding getArea() method from shape class
    @Override
    public double getArea(){
        double sideLength = 2 * xLocal[0] * Math.sin(Math.PI / 3);
        return (Math.sqrt(3) / 4)* Math.pow(sideLength, 2);

    }

    //overriding getPerimeter() method from shape class
    @Override
    public double getPerimeter(){
        double sideLength = 2 * xLocal[0] * Math.sin(Math.PI / 3);
        return 3 * sideLength;

    }
    

}
