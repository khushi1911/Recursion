import java.util.*;

public class power{

    public static int pow(int x, int n){
        
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        return x*pow(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println("enter the power:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println("enter the no :");
        int x =sc.nextInt();

        System.out.println(pow(x,n));
    }
}