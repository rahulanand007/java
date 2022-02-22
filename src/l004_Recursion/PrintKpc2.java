package l004_Recursion;
import java.util.*;

public class PrintKpc2 {

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKpc(str,"");
        scn.close();    
    }
    public static void printKpc(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        String codeforch = codes[ch - '0'];
        for(int i=0; i<codeforch.length(); i++){
            char cho = codeforch.charAt(i);
            printKpc(ros, ans+ cho);
        }
    }
    
}
