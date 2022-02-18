import processing.core.PApplet;

public class MainApp extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    Balls balls[];
    public static int x=0;

    public static void main(String[] args) {
        PApplet.main("MainApp",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        balls=new Balls[4];
        for (int i = 0; i < balls.length; i++) {
            int j = i+1;
            balls[i] = new Balls(0,j);
        }
    }

    @Override
    public void draw() {
        for (int i=0; i < balls.length; i++) {
            ellipse(balls[i].getxMultiplier()*(i+1),balls[i].getyMultiplier()*HEIGHT/5,10,10);
            int x= balls[i].getxMultiplier();
            x++;
            balls[i].setxMultiplier(x);
        }
    }
}
