
public class newString{

    public static void atend(String str ,int idx,int count ,String newstr){
        
        if(idx == str.length()){
            for(int i=0 ;i<count ;i++){
                newstr += "x";
            }
            System.out.println(newstr);
            return;
        }
        char curr = str.charAt(idx);
        if(curr == 'x'){
            count++;
            atend(str , idx+1,count , newstr);
        }else{
            newstr += curr;
            atend(str , idx+1,count , newstr);
        }
    }
    public static void main(String[] args) {
        String str ="hxexllxxox";

        atend(str,0,0,"");
    }
}