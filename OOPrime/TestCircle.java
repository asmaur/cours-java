package OOPrime;


public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        System.out.println("The circle has radius of " 
        + c1.getRadius() + " and area of " + c1.getArea());


        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " 
        + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(2.0, "blue");
        System.out.println("The circle has radius of " 
        + c3.getRadius() + " area of " + c3.getArea()+" and "+ c3.getColor()+" color");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

    }
}
