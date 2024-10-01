import java.awt.Color;

/**
 * RegularPolygon class models polygons, subclass of Shape class.
 */
public class RegularPolygon extends Shape {
    // Private instance variables
    private int numOfSides;
    private double radius;

    /**
     * Constructor for building  n-sided polygon (radius: r).
     *
     * @param n Number of sides of polygon.
     * @param r radius of polygon.
     */
    public RegularPolygon(int n, double r) {
        super(Color.BLACK, true, 0, 0, 0, new double[0], new double[0]);
        setNumOfSides(n);
        setRadius(r);
    }

    /**
     * Constructor for building regular n-sided polygon (radius: 1.0).
     *
     * @param n Number of sides of polygon.
     */
    public RegularPolygon(int n) {
        this(n, 1.0);
    }

    /**
     * Constructor for building 3-sided polygon (radius of 1.0).
     */
    public RegularPolygon() {
        this(3, 1.0);
    }

    /**
     * Collects number of sides of regular polygon.
     *
     * @return Number of sides of polygon.
     */
    public int getNumOfSides() {
        return numOfSides;
    }

    /**
     * Collects radius of the regular polygon.
     *
     * @return Radius of polygon.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets number of sides of n-sided polygon.
     * Resets the local coordinates of vertices.
     *
     * @param n Number of sides of polygon.
     */
    public void setNumOfSides(int n) {
        if (n < 3) {
            n = 3;
        }
        this.numOfSides = n;
        setVertices();
    }

    /**
     * Sets radius of n-sided polygon.
     * Resets local coordinates of vertices of n-sided polygon.
     *
     * @param r Radius of the polygon.
     */
    public void setRadius(double r) {
        if (r < 0) {
            r = 0;
        }
        this.radius = r;
        setVertices();
    }

    /**
     * Sets local coordinates of vertices of n-sided polygon (based on number of sides, radius).
     */
    private void setVertices() {
        double[] xLocal = new double[numOfSides];
        double[] yLocal = new double[numOfSides];

        double angle = numOfSides % 2 == 0 ? Math.PI / numOfSides : 0;
        double increment = 2 * Math.PI / numOfSides;

        for (int i = 0; i < numOfSides; i++) {
            xLocal[i] = radius * Math.cos(angle + i * increment);
            yLocal[i] = radius * Math.sin(angle + i * increment);
        }

        setXLocal(xLocal);
        setYLocal(yLocal);
    }

    /**
     * Whether point is in polygon or not.
     * @param x X-coordinate of point.
     * @param y Y-coordinate of point.
     * @return Boolean, whether point in polygon or not.
     */
    public boolean contains(double x, double y) {
        int[] xCanvas= getX();
        int[] yCanvas = getY();
        int n = numOfSides;

        boolean inside = false;
        for (int i = 0, j = n - 1; i < n; j = i++) {
            if (((yCanvas[i] > y) != (yCanvas[j] > y)) &&
                    (x < (xCanvas[j] - xCanvas[i]) * (y - yCanvas[i]) / (yCanvas[j] - yCanvas[i]) + xCanvas[i])) {
                inside = !inside;
            }
        }
        return inside;
    }
}
