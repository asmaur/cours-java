package OOPrime;

public class Rectangle extends Shape{
    private double width;
    private double length;

    
    Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*length*width;
    }

    @Override
    public String toString(){
        return "Rectangle["+super.toString()+",width="+getWidth()+",length="+getLength()+"]";
    }
    
    
}
