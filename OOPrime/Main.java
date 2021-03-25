package OOPrime;

public class Main {
    public static void main(String[] args) {
        
        Resizable resizable = new ResizableCircle(10);

        System.out.println( resizable.toString());

        resizable.resize(-23);
        System.out.println( resizable.toString());

    }
}
