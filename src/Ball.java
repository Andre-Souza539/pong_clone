import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle{

    int initialSpeed = 3;
    Random random;
    int xVelocity;
    int yVelocity;



    Ball(int xPosition, int yPosition, int with,int height){
        super(xPosition,yPosition,with,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection==0)
            randomXDirection--;
        setXDirection(randomXDirection*initialSpeed);
        int randomYDirection = random.nextInt(2);
        if(randomYDirection==0)
            randomYDirection--;
        setYDirection(randomYDirection*initialSpeed);
    }

    public void setXDirection(int randomXDirection){
        xVelocity = randomXDirection;
    }
    public void setYDirection(int randomYDirection){
        yVelocity = randomYDirection;
    }

    public void move(){
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x,y,height,width);
    }


}
