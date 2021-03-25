package OOPrime;

public class MovableCircle implements Movable{
    private double radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp(){
        this.center.y -= center.getYSpeed();
    };
    public void moveDown(){
        this.center.y += center.getYSpeed();
    };
    public void moveLeft(){
        this.center.x -= center.getXSpeed();
    };

    public void moveRight(){
        this.center.x += center.getXSpeed();
    };
    public double getRadius(){
        return radius;
    }

    public String toString(){
        return "Circle["+center.toString()+", radius="+getRadius()+"]";
    }
}
