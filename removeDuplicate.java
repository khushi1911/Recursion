
public class removeDuplicate{

    public static boolean[] map= new boolean[26];

    public static void duplicate(String str ,int idx,String newstr){
        
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char curr = str.charAt(idx);
        if(map[curr -'a']){
            duplicate(str, idx+1, newstr);
        }else{
            newstr += curr;
            map[curr -'a']=true;
            duplicate(str, idx+1, newstr);
        }
    }
    public static void main(String[] args) {
        String str ="hxexllxxox";

        duplicate(str, 0, "");
    }
}