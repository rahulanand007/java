package l004_Recursion;
import java.util.*;

public class PrintPermutations {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str, "");
        scn.close();
    }

    public static void printPermutations(String str, String ans){

        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            String ros= left +right;
            printPermutations(ros, ans+ch);
        }
    }
}
