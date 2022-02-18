//import processing.core.PApplet;

public class Balls {

    private final int WIDTH = 640;
    private final int HEIGHT = 480;
    private int xMultiplier;
    private int yMultiplier;

    public Balls(int xMultiplier,int yMultiplier) {
        this.xMultiplier = xMultiplier;
        this.yMultiplier = yMultiplier;
    }

    public void setxMultiplier(int xMultiplier) {
        this.xMultiplier = xMultiplier;
    }

    public int getxMultiplier() {
        return xMultiplier;
    }

    public int getyMultiplier() {
        return yMultiplier;
    }
}
