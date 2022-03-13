import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallsOOPs extends PApplet {

    public static final int WINDOW_HEIGHT = 480;
    public static final int WINDOW_WIDTH = 640;
    public static final double HEIGHT_FACTOR = 0.2;
    public static final int BALL_SIZE = 10;
    public static final int BALL_COUNT = 4;
    public static ArrayList<Ball> ballArray;

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void setup() {
        ballArray = new ArrayList<Ball>();
        for (int ballNo = 0; ballNo< BALL_COUNT; ballNo++){
            float ballPosition = getBallPosition(ballNo);
            ballArray.add(new Ball(ballPosition, BALL_SIZE));
        }
    }

    private float getBallPosition(int ballNo) {
        return (float) ((ballNo + 1) * (WINDOW_HEIGHT * HEIGHT_FACTOR));
    }

    @Override
    public void draw() {
        for (int ballNo=0; ballNo<BALL_COUNT; ballNo++){
            ballArray.get(ballNo).drawBall(this, ballNo + 1);
        }
    }

    public static void main(String[] args) {
        PApplet.main("FourBallsOOPs", args);
    }
}
