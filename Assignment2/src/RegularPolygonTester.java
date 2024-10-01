
/**
 * Tester class for RegularPolygon class.
 */


public class RegularPolygonTester {
    public static void main(String[] args) {
        // Create RegularPolygon object
        RegularPolygon polygon = new RegularPolygon(5, 10.0);

        // Test getters
        //number of sides getter
        System.out.println("Number of Sides: " + polygon.getNumOfSides());
        //radius getter
        System.out.println("Radius: " + polygon.getRadius());

        // Test setters
        //number of sides setter
        polygon.setNumOfSides(6);
        //radius setter
        polygon.setRadius(15.0);

        // Test getters after setting
            //number of sides
        System.out.println("Updated Number of Sides: " + polygon.getNumOfSides());
            //radius
        System.out.println("Updated Radius: " + polygon.getRadius());

        // Test contains method
        System.out.println("Contains (10, 10): " + polygon.contains(10, 10));
        System.out.println("Contains (0, 0): " + polygon.contains(0, 0));

        // Test getX
        System.out.println("X Canvas: " + java.util.Arrays.toString(polygon.getX()));
        // Test getY
        System.out.println("Y Canvas: " + java.util.Arrays.toString(polygon.getY()));
    }
}
