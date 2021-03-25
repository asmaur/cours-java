import java.util.Scanner;

public class Palindrome {

    public static boolean palindrome(int value){
        String newValue = new String(String.valueOf(value));
        StringBuilder palim = new StringBuilder(newValue);
        String revers = palim.reverse().toString();
        if(revers.equals(newValue)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Entrer a value: ");
        int value = input.nextInt();

        System.out.println(palindrome(value));
    }
}
