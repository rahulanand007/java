package l004_Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class GetKpc {

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKpc(String str){
        if(str.length()==0){
            ArrayList<String> eres = new ArrayList<>();
            eres.add("");
            return eres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> subres = getKpc(ros);

        ArrayList<String> res = new ArrayList<>();
        String codeforch = codes[ch - '0'];
        for(int i=0; i<codeforch.length(); i++){
            char chcode = codeforch.charAt(i);
            for(String j:subres){
                res.add(chcode + j);
            }
        }return res;
    }

    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> list = getKpc(str);
        System.out.println(list);
        scn.close();
    }
    
}
