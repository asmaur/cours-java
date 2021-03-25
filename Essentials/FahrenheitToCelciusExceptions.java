import java.util.InputMismatchException;
import java.util.Scanner;

public class FahrenheitToCelciusExceptions {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        
        int fahrenheit = 0;
        boolean success = true;

        while(success){
            try{      
                System.out.print("Entrer a Fahrenheit value: ");
                fahrenheit = input.nextInt();
                success = false;
            }
            catch (InputMismatchException | ArithmeticException e){
                input.nextLine();
                System.out.println("Sorry, that wanst an int");
                System.out.println("Please try again: ");
            }
            finally{
                input.nextLine();
            }
        }

        double celcuis = (5.0/9)*(fahrenheit-32);
                System.out.printf("Fahrenheit: %d\n", fahrenheit);
                System.out.printf("Celcius:  %.1f\n", celcuis);
        
    }
}
