package l004_Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {

    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String> eres = new ArrayList<>();
            eres.add("");
            return eres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> subres = gss(ros);
        ArrayList<String> res = new ArrayList<>();
        for(String i: subres){
            res.add("" + i);
        }
        for(String i: subres){
            res.add(ch + i);
        }
        return res;
    }

    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> list = gss(str);
        System.out.println(list);
        scn.close();
    }
    
}
