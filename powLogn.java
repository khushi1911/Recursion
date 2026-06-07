import java.util.*;

public class powLogn{

    public static int pow(int x, int n){
        
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return pow(x,n/2)*pow(x,n/2);
        }
        else{
            return pow(x,n/2)*pow(x,n/2)*x;
        }
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