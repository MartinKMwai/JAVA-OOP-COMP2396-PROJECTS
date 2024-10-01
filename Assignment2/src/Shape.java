import java.awt.Color;

/**
 * The Shape class models general shapes.
 */
public class Shape {
    // Private instance variables
    private Color color;
    private boolean filled;
    private double theta;
    private double xc;
    private double yc;
    private double[] xLocal;
    private double[] yLocal;

    /**
     * Constructor for Shape class.
     *
     * @param color   Color of shape.
     * @param filled  Shape is filled or not.
     * @param theta   Orientation of the shape (radians).
     * @param xc      X-coordinate of shape centre.
     * @param yc      Y-coordinate of shape centre.
     * @param xLocal  X-coordinates of vertices.
     * @param yLocal  Y-coordinates of vertices.
     */
    public Shape(Color color, boolean filled, double theta, double xc, double yc, double[] xLocal, double[] yLocal) {
        this.color = color;
        this.filled = filled;
        this.theta = theta;
        this.xc = xc;
        this.yc = yc;
        this.xLocal = xLocal;
        this.yLocal = yLocal;
    }

    /**
     * Collects shape color.
     *
     * @return shape color.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets shape color.
     *
     * @param color shape color.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Collects fill type of shape.
     *
     * @return shape filled or not.
     */
    public boolean getFilled() {
        return filled;
    }

    /**
     * Sets fill type of shape.
     *
     * @param filled Shape filled or not.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Collect shape orientation (radians).
     *
     * @return shape orientation.
     */
    public double getTheta() {
        return theta;
    }

    /**
     * Sets shape orientation.
     *
     * @param theta The orientation of the shape in radians.
     */
    public void setTheta(double theta) {
        this.theta = theta;
    }

    /**
     * Collect X-coordinate of shape centre.
     *
     * @return X-coordinate of shape centre.
     */
    public double getXc() {
        return xc;
    }

    /**
     * Sets X-coordinate of shape centre.
     *
     * @param xc X-coordinate of shape centre.
     */
    public void setXc(double xc) {
        this.xc = xc;
    }

    /**
     * Collects Y-coordinate of shape centre.
     *
     * @return Y-coordinate of shape centre.
     */
    public double getYc() {
        return yc;
    }

    /**
     * Sets Y-coordinate of shape centre.
     *
     * @param yc Y-coordinate of shape centre.
     */
    public void setYc(double yc) {
        this.yc = yc;
    }

    /**
     * Collects Y-coordinates of vertices.
     *
     * @return X-coordinates of vertices.
     */
    public double[] getXLocal() {
        return xLocal;
    }

    /**
     * Sets X-coordinates of vertices.
     *
     * @param xLocal X-coordinates of vertices.
     */
    public void setXLocal(double[] xLocal) {
        this.xLocal = xLocal;
    }

    /**
     * Collects Y-coordinates of vertices.
     *
     * @return Y-coordinates of vertices.
     */
    public double[] getYLocal() {
        return yLocal;
    }

    /**
     * Sets Y-coordinates of vertices.
     *
     * @param yLocal Y-coordinates of vertices.
     */
    public void setYLocal(double[] yLocal) {
        this.yLocal = yLocal;
    }

    /**
     * Translates center of shape (dx & dy).
     *
     * @param dx X-axis translation.
     * @param dy Y-axis translation.
     */
    public void translate(double dx, double dy) {
        this.xc += dx;
        this.yc += dy;
    }

    /**
     * Rotates the shape (angle: dt).
     *
     * @param dt Rotation angle (radians).
     */
    public void rotate(double dt) {
        this.theta += dt;
    }

    /**
     * Collects X-coordinates of vertices.
     *
     * @return X-coordinates of vertices.
     */
    public int[] getX() {
        int[] xCanvas = new int[xLocal.length];
        for (int i = 0; i < xLocal.length; i++) {
            xCanvas[i] = (int) (xc + xLocal[i] * Math.cos(theta) - yLocal[i] * Math.sin(theta));
        }
        return xCanvas;
    }

    /**
     * Collects Y-coordinates of vertices.
     *
     * @return Y-coordinates of vertices.
     */
    public int[] getY() {
        int[] yCanvas = new int[yLocal.length];
        for (int i = 0; i < yLocal.length; i++) {
            yCanvas[i] = (int) (yc + xLocal[i] * Math.sin(theta) + yLocal[i] * Math.cos(theta));
        }
        return yCanvas;
    }
}
