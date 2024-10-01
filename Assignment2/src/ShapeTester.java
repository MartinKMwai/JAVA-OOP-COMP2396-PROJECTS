import java.awt.Color;

/**
 * Tester class for Shape class, testing all shape properties.
 */


public class ShapeTester {
    public static void main(String[] args) {
        // Create Shape object
        double[] xLocal = {0.0, 1.0, 0.5};
        double[] yLocal = {0.0, 0.0, 0.866};
        Shape shape = new Shape(new Color(255, 0, 0), true, 0.0, 10.0, 10.0, xLocal, yLocal);

        // Test getters (color, shape, theta, xc, yc, xLocal, yLocal)
        System.out.println("Color: " + shape.getColor());
        System.out.println("Filled: " + shape.getFilled());
        System.out.println("Theta: " + shape.getTheta());
        System.out.println("Xc: " + shape.getXc());
        System.out.println("Yc: " + shape.getYc());
        System.out.println("XLocal: " + java.util.Arrays.toString(shape.getXLocal()));
        System.out.println("YLocal: " + java.util.Arrays.toString(shape.getYLocal()));

        // Test setters (color, shape, theta, xc, yc, xLocal, yLocal)
        shape.setColor(new Color(0, 255, 0));
        shape.setFilled(false);
        shape.setTheta(Math.PI / 4);
        shape.setXc(20.0);
        shape.setYc(20.0);
        shape.setXLocal(new double[]{0.0, 2.0, 1.0});
        shape.setYLocal(new double[]{0.0, 0.0, 1.732});

        // Test getters after setting (color, shape, theta, xc, yc, xLocal, yLocal)
        System.out.println("Updated Color: " + shape.getColor());
        System.out.println("Updated Filled: " + shape.getFilled());
        System.out.println("Updated Theta: " + shape.getTheta());
        System.out.println("Updated Xc: " + shape.getXc());
        System.out.println("Updated Yc: " + shape.getYc());
        System.out.println("Updated XLocal: " + java.util.Arrays.toString(shape.getXLocal()));
        System.out.println("Updated YLocal: " + java.util.Arrays.toString(shape.getYLocal()));

        // Test translate, rotate (dx, dy, dt, theta, yc, xc)
        shape.translate(5.0, 5.0);
        shape.rotate(Math.PI / 2);
        System.out.println("After Translate, Rotate:");
        System.out.println("Xc: " + shape.getXc());
        System.out.println("Yc: " + shape.getYc());
        System.out.println("Theta: " + shape.getTheta());

        // Test getX, getY
        System.out.println("X Canvas: " + java.util.Arrays.toString(shape.getX()));
        System.out.println("Y Canvas: " + java.util.Arrays.toString(shape.getY()));
    }
}
