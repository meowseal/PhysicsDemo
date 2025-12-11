import libs.lookupDistance;
import libs.Objects.*;

public class Main {
    // Objects and Lookers
    static lookupDistance looker = new lookupDistance(1);
    static Circle shape = new Circle(3,5,0,0);

    // Main
    public static void main(String[] args)
        {
            // Set Distance Multiplier to 3
            looker.setMultiplier(3.0);

            System.out.println(looker.getChar(30));
            System.out.println(looker.getChar(3));
        }
}