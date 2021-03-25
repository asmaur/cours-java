import java.util.*;

public class OddEven {
    public static boolean oddEven(int value){
        if(value % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = input.nextInt();
        System.out.println(oddEven(value));
    }
}