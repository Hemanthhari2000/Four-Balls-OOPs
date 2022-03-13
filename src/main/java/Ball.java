import processing.core.PApplet;

public class Ball extends PApplet {
    float velocityX;
    float positionY;
    int ballSize;


    Ball(float positionY, int ballSize){
        this.velocityX = 0;
        this.positionY = positionY;
        this.ballSize = ballSize;
    }

    public void drawBall(FourBallsOOPs fourBallsOOPs, int ballNo){
        fourBallsOOPs.ellipse(velocityX, positionY, ballSize, ballSize);
        velocityX += ballNo;
    }

    public static void main(String[] args) {
        PApplet.main("Ball", args);
    }
}
