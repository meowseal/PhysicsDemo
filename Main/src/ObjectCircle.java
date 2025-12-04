// Initialize Class
public class ObjectCircle {
    private final double mass;
    private final double radius;
    private final double weight;

    // object param constructor
    public ObjectCircle(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.weight = mass * Math.PI * Math.pow(radius,2);
    }

    // Return Statements for Object
    public double getMass() {return mass;}  // returns mass
    public double getRadius() {return radius;}  // returns mass
    public double getWeight() {return weight;}  // returns mass

}
