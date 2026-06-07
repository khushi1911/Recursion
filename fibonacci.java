import java.util.*;

public class fibonacci{

    public static void fib(int a, int b, int n) {
        if(n == 0) {
        return;
    }
    System.out.println(a);
    fib(b, a+b, n-1);
}
    public static void main(String[] args) {
        System.out.println("enter the no:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;

        fib(a,b,n);
    }
}