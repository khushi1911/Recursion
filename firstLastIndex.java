
public class firstLastIndex{

    public static int first =-1;
    public static int last =-1;

    public static void occur(String str ,int idx,char elem){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = str.charAt(idx);
        if (curr == elem){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        occur(str,idx+1,elem);
    }
    public static void main(String[] args) {
        String str ="hellollo";

        occur(str,0,'l');
    }
}