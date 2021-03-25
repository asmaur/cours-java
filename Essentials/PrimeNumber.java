import java.util.Scanner;

public class PrimeNumber {
    public static boolean prime(int value){
        int n = value-1;

        while(n != 1){
            if( value%n == 0 ){
                return false;
            }
            n--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = input.nextInt();

        System.out.println(prime(value));
    }
}
