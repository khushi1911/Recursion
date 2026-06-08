
import java.util.ArrayList;

public class arraySubset{

    public static void print(ArrayList<Integer> subset){
        for (int i=0 ; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.err.println();
    }
   public static void subset1(int n , ArrayList<Integer> subset) {
      if(n==0){
        print(subset);
        return ;
      }
      subset.add(n);
      subset1(n-1, subset);

      subset.remove(subset.size()-1);
      subset1(n-1, subset);
   }


   public static void main(String args[]) {
       int n=3;
       ArrayList<Integer> subset = new ArrayList<>();
       subset1(n, subset);
   }
}
