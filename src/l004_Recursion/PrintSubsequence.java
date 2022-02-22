package l004_Recursion;
import java.util.*;

public class PrintSubsequence {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printSubsequence(str,"");
        scn.close();
    }

    public static void printSubsequence(String str , String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        printSubsequence(ros, ans+ch);
        printSubsequence(ros, ans+"");
    }
}
