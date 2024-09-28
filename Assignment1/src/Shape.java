import java.awt.Color;

/**
 * The Shape class serves as the superclass for different types of shapes.
 */
public abstract class Shape {
    /**
     * A Color object to specify the color of the shape.
     */
    public Color color;
    /**
     * A boolean value to specify whether the shape is filled or not filled.
     */
    public boolean filled;
    /**
     * A double value specifying the orientation (in radians) of the shape in the canvas.
     */
    public double theta;
    /**
     * A double value specifying the x-coordinate of the center of the shape in the canvas.
     */
    public double xc;
    /**
     * A double value specifying the y-coordinate of the center of the shape in the canvas.
     */
    public double yc;
    /**
     * An array of values specifying the x-coordinates of the vertices (counter-clockwise) of the shape in its local coordinates.
     */
    public double [] xLocal;
    /**
     * An array of values specifying the y-coordinates of the vertices (counter-clockwise) of the shape in its local coordinates.
     */
    public double [] yLocal;

    /**
     * @param color the color of the shape
     * @param filled whether the shape is filled or not
     * @param theta the orientation of the shape in radians
     * @param xc the x-coordinate of the center of the shape
     * @param yc the y-coordinate of the center of the shape
     * @param xLocal the x-coordinates of the vertices
     * @param yLocal the y-coordinates of the vertices
     */

    public Shape(Color color, boolean filled, double theta, double xc, double yc, double [] xLocal, double [] yLocal){

        this.color = color;
        this.filled = filled;
        this.theta = theta;
        this.xc = xc;
        this.yc = yc;
        this.xLocal = xLocal;
        this.yLocal = yLocal;
    }
    /**
     * Calculates the area of the shape.
     * @return the area of the shape
     */
    public abstract double getArea();
    /**
     * Calculates the perimeter of the shape.
     * @return the perimeter of the shape
     */
    public abstract double getPerimeter();
    /**
     * A dummy method for setting the local coordinates of the vertices of shape.
     * To be overridden in the subclasses.
     * @param d a placeholder parameter
     */
    public void setVertices(double d){

    }
    /**
     * Translates the center of the shape by dx and dy, respectively, along the x and y directions
     * @param dx the amount to translate on x-axis
     * @param dy the amount to translate on y-axis
     */
    public void translate(double dx, double dy){
        this.xc += dx;
        this.yc +=dy;
    }
    /**
     * Rotates the shape on its center by an angle of dt (in radians).
     * @param dt rotation angle
     */

    public void rotate(double dt){
        this.theta += dt;
    }
    /**
     * Computes the canvas coordinates of the vertices of the shape.
     * @return array of values specifying the x-coordinates of the vertices.
     */
    public double[] getCanvasXCoordinates(){
        double[] xCanvas = new double[xLocal.length];
        for (int i = 0; i < xLocal.length; i++){
            xCanvas[i] = xLocal[i] * Math.cos(theta) - yLocal[i] * Math.sin(theta) + xc;
        }
        return xCanvas;
    }

    /**
     * Computes the canvas coordinates of the vertices of the shape.
     * @return array of values specifying the y-coordinates of the vertices.
     */
    public double[] getCanvasYCoordinates(){
        double[] yCanvas = new double[yLocal.length];
        for (int i = 0; i < yLocal.length; i++){
            yCanvas[i] = xLocal[i] * Math.sin(theta) + yLocal[i] * Math.cos(theta) + yc;
        }
        return yCanvas;
    }

    /**
     * Retrieves the x-coordinates of the vertices (counter-clockwise order) of the shape
     * @return array of integers specifying the x-coordinates.
     */
    public int[] getX(){
        double[] xCanvas = getCanvasXCoordinates();
        int[] xInt = new int[xCanvas.length];
        for (int i = 0; i < xCanvas.length; i++){
            xInt[i] = (int) Math.round(xCanvas[i]);

        }
        return xInt;
    }

    /**
     * Retrieves the y-coordinates of the vertices (counter-clockwise order) of the shape
     * @return array of integers specifying the y-coordinates.
     */
    public int[] getY(){
        double[] yCanvas = getCanvasYCoordinates();
        int[] yInt = new int[yCanvas.length];
        for (int i = 0; i < yCanvas.length; i++) {
            yInt[i] = (int) Math.round(yCanvas[i]);

        }
        return yInt;
    }

}
