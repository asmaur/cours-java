import java.util.Scanner;

public class ReverseString {

    public static String reverse(String string){
        String newString = "";
        int i = string.length();
        if( string.length() > 0) {
            while (newString.length() != string.length()) {
                newString = newString + string.charAt(i-1);
                i--;
            }
            return newString;
        }else {
            newString = string;

            return newString;
        }
    }

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Entre uma palavra: ");
        String string = input.nextLine();
        System.out.println(reverse(string));
    }
}
