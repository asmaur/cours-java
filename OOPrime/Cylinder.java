package OOPrime;

public class Cylinder extends Circle{
    private double height;

    Cylinder(){
        super();
        this.height = 1;
    }

    Cylinder(double height){
        super();
        this.height = height;
    }
    Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double getArea(){
        return (2*Math.PI*height*getRadius())+(2*Math.PI*getRadius()*getRadius());
    }
    public double getVolume(){
        return getRadius()*getRadius()*height;
    }

    @Override
    public String toString(){
        return "Cilinder: subclass of "+ super.toString()+ " height="+ height;
    }

}
