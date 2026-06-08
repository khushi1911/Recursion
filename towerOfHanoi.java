import java.util.*;

public class towerOfHanoi{

    public static void toh(int n , String source, String help , String dest){
        
        if(n==1){
            System.out.println("move disk "+n+" from "+source+" to "+dest);
            return;
        }
        toh(n-1,source,dest,help);
        System.out.println("move disk "+n+" from "+source+" to "+dest);
        toh(n-1,help,source,dest);
    }
    public static void main(String[] args) {
        System.out.println("enter the no:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        toh(n,"s","h","d");
    }
}