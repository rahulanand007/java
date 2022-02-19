package l004_Recursion;
import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt();
        System.out.println(getStairPaths(n));
        scn.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> eres = new ArrayList<>();
            eres.add("");
            return eres;
        }else if(n<0){
            ArrayList<String> eres = new ArrayList<>();
            return eres;
        }

        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);

        ArrayList<String> res = new ArrayList<>();

        for(String j : path1){
            res.add("1"+j);
        }
        for(String j : path2){
            res.add("2"+j);
        }
        for(String j : path3){
            res.add("3"+j);
        }
        return res;
    }
    
}
