import java.util.Scanner;

public class PowerOfTwo {

    public static boolean power(int value, int pow){
        int n, current = value;

        while( current != pow){
            if(current%pow == 0){
                current /= pow;
            }else{
                return false;
            }

        }

        return true;
    }
    public static void main(String[] args) {

        //System.out.print("Entre o valor e a potencia: ");
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Entre o valor e a potencia: ");
            try {
                if (input.hasNextInt()) {
                    int value = input.nextInt();
                    int pow = input.nextInt();

                    System.out.println(power(value, pow));
                    break;

                }
            } catch (Exception e) {
                System.out.println("An error has occured.");
            }
        }
    }
}
