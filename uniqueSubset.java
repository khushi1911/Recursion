
import java.util.HashSet;


public class uniqueSubset{

    public static void sub( String str , int idx , String newstr , HashSet<String> set ){
        
        if(idx == str.length()){
           if(set.contains(newstr)){
            return;
           }else{
            System.out.println(newstr);
            set.add(newstr);
            return;
           }
        }
        char curr = str.charAt(idx);
        sub(str, idx+1, newstr+curr,set);
        sub(str, idx+1, newstr,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        sub(str, 0, "",set);
    }
}