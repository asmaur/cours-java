package OOPrime;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getYSpeed() {
        return this.ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXSpeed() {
        return this.xSpeed;
    }

    @Override
    public void moveUp(){
        this.y -= ySpeed;
    };
    @Override
    public void moveDown(){
        this.y += ySpeed;
    };
    @Override
    public void moveLeft(){
        this.x -= xSpeed;
    };

    @Override
    public void moveRight(){
        this.x += xSpeed;
    };

    
    public String toString(){
        return "Point[x="+getX()+ ",y="+getY()+"]";
    }
}
