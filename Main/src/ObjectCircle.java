public class ObjectCircle {
    // Object Parts
    private final double mass;
    private final double radius;
    private final double weight;

    // Object World Relation
    public double x;
    public double y;

    // object param constructor
    public ObjectCircle(double mass, double radius, double x, double y)
    {
        this.mass = mass;
        this.radius = radius;
        this.weight = mass * Math.PI * Math.pow(radius, 2);
        this.x = x;      // assign to instance variables
        this.y = y;
    }

    // Getters
    public double getMass() { return mass; }
    public double getRadius() { return radius; }
    public double getWeight() { return weight; }

    // Update position
    public void updatePosition(double newX, double newY)
    {
        this.x = newX;
        this.y = newY;
    }
}
