import java.util.*;

public class sumOfNo{

    public static void sum(int n, int sum1){
        
        if(n==0){
        
        System.out.println(sum1);
        return;
        }
        sum1+=n;
        sum(n-1,sum1);
    }
    public static void main(String[] args) {
        System.out.println("enter the no:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum1=0;
        sum(n,sum1);
    }
}