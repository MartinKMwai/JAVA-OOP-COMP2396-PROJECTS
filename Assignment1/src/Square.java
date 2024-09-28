import java.awt.Color;

/**
 * Square class models square shape.
 */
public class Square extends Shape{

    /**
     * Default constructor for Square shape.
     */
    public Square(){
        super(Color.RED, true, 0, 0, 0, new double[4], new double[4]);
    }

    /**
     * @param color color of square
     * @param filled whether square is filled or not
     * @param theta orientation of square in radians
     * @param xc x-coordinate of center of the square
     * @param yc y-coordinate of center of the square
     */
    public Square(Color color, boolean filled, double theta, double xc, double yc){
        super(color, filled, theta, xc, yc, new double[4], new double[4]);
    }
    //overriding setVertices() method from shape class
    @Override
    public void setVertices(double d){
        xLocal = new double[]{d, d, -d, -d};
        yLocal = new double[]{d, -d, -d, d};

    }
    //overriding getArea() method from shape class
    @Override
    public double getArea(){
        double sideLength = 2*xLocal[0];
        return sideLength * sideLength;
    }

    //overriding getPerimeter() method from shape class
    @Override
    public double getPerimeter(){
        double sideLength = 2*xLocal[0];
        return 4*sideLength;
    }

}
