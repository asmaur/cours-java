package OOPrime;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1;
        this.color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
        this.color = "red";
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public String getColor(){
        return color;
    }   

    public void setRadius(double radius){
        this.radius = radius;
    }
    public void color(){
        this.color = color;
    }

    public String toString(){
        return "Circle[ radius= "+radius+" color="+color+"]";    
    }

    
}
