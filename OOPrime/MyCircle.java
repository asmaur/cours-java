package OOPrime;

public class MyCircle implements GeometricObject{
    private double radius;

    public MyCircle(){
        this.radius = 1.0;
    }

    public MyCircle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    @Override
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }

    public String toString(){
        return "Circle[radius="+getRadius()+"]";
    }
}
