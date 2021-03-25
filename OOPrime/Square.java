package OOPrime;

public class Square extends Rectangle{
    private double side;

    Square(){
        super();
    }
    Square(double side){
        super(side, side);
        this.side = side;
    }
    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }

    public void setWidth(double width){
        this.side = width;
    }
    public void setLength(double length){
        this.side = length;
    }

    /*@Override
    public double getArea(){
        return side*side;
    }*/

    @Override
    public String toString(){
        return "Square["+super.toString()+"]";
    }
    

}
