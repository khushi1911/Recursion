
public class reverseString{

    public static void reverse(String str ,int x){
        if(x == 0){
            System.out.print(str.charAt(x));
            return;
        }
        System.out.print(str.charAt(x));
        reverse(str,x-1);
    }
    public static void main(String[] args) {
        String str ="hello";

        reverse(str,str.length()-1);
    }
}