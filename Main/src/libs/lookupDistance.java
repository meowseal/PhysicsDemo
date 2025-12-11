// package it into the library
package libs;

// initializer
public class lookupDistance  {
    double distanceMultiplier = 0;

    // Set the multiplier
    public void setMultiplier(double multiply)
    {
        distanceMultiplier = multiply;
    }

    // return distance multiplier for debugging
    public double getMultiplier() {
        return distanceMultiplier;
    }

    public String getChar(double distance)

    {

        // Return shape given distance * multiplier
        if (distance * distanceMultiplier > 100) {return " ";}
        else if (distance * distanceMultiplier < 100 && distance * distanceMultiplier >= 80) {return ".";}
        else if (distance * distanceMultiplier < 80 && distance * distanceMultiplier >= 60) {return "*";}
        else if (distance * distanceMultiplier < 60 && distance * distanceMultiplier >= 40) {return "%";}
        else if (distance * distanceMultiplier < 40 && distance * distanceMultiplier >= 20) {return "$";}
        else if (distance * distanceMultiplier < 20 && distance * distanceMultiplier >= 0) {return "@";}
        else {return "#";}

    }

}
