import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer a value: ");
        int value = input.nextInt();
        //arraysort(value);
        System.out.println(arraysort(value));
    }

    public static boolean arraysort(int value){
        int sum = 0;
        String temp = Integer.toString(value);
        int[] valueArray = new int[temp.length()];
        for (int x=0; x<valueArray.length; x++) {
            valueArray[x] = Integer.parseInt(String.valueOf(temp.charAt(x)));
            //System.out.println(Integer.parseInt(String.valueOf(temp.charAt(x))));
        }
        for (int i: valueArray) {
            sum += (i*i*i);
            System.out.println(i);
            ;

        }
        System.out.printf("sum: %d\n", sum);

        if(sum == value){
            return true;
        }else {
            return false;
        }
    }
}
