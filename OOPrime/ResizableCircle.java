package OOPrime;

public class ResizableCircle extends MyCircle implements Resizable{
    ResizableCircle(double radius){
        super(radius);
    }
    public void resize(int percent){
        double newRadius = (1+percent/100.0)*super.getRadius();
        //System.out.println((percent/100.0));
        System.out.println(newRadius);
        super.setRadius(newRadius);
    }

    @Override
    public String toString(){
        return "ResizableCircle["+super.toString();
    }
}
