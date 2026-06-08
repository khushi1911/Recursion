
public class tiles{

    public static int totalWays(int n , int m){
        
       if (n==m){
        return 2;
       }
       if (n<m){
        return 1;
       }
       int vertical = totalWays(n-m, m);
       int horiz = totalWays(n-1, m);
       return vertical + horiz;
    }
    public static void main(String[] args) {
        int n=4, m=2;
        System.out.println(totalWays(n, m));
    }
}