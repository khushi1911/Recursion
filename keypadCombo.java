
public class keypadCombo{

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void keyCombo(String str, int idx , String combi){
        
        if(idx == str.length()){
            System.out.println(combi);
            return ;
        }
        char curr = str.charAt(idx);
        String mapping = keypad[curr-'0'];
        for(int i=0; i<mapping.length() ; i++){
            keyCombo(str, idx+1, combi+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        
        String str = "23";
        keyCombo(str, 0,"");
    }
}