public class Fibonacci {
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }else {
            return (n-1)+(n-2);
        }
    }
    public static void main(String[] args) {
        int n = 11;
        int a = 0;
        int b = 1;
        int fib =0;

        while(n != 0){
            fib = a+b;
            //System.out.println(a);
            System.out.println(b);
            //System.out.printf("Fib: ", fib);

            a=b;
            b=fib;
            n--;

        }

    }
}
