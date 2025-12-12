package libs;

public class Render {
    lookupDistance looker = new lookupDistance(1);


    private int screenX;
    private int screenY;




    public Render(int screenX1, int screenY1)
    {
        screenX = screenX1;
        screenY = screenY1;
    }

    public void setMultiplier(double multiplier)
    {
        looker.setMultiplier(multiplier);

    }

    public double getMultiplier()
    {
        return looker.getMultiplier();

    }


    public void clearScreen()
    {
    // Clear the console for IntelliJ IDEA
    }

    public void renderFrame() {

    }



}
