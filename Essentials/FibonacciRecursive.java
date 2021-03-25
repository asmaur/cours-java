public class FibonacciRecursive {
    public static int fibonacci(int n){
        if(n==0 || n==1){
            System.out.println(n);
            return n;
        }else {
            System.out.println(n);
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        int n = 11;

        System.out.println(fibonacci(n));

    }
}
