package l004_Recursion;
import java.util.*;

public class GetMazePaths {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
        scn.close();   
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sr==dr && sc==dc ){
            ArrayList< String> eres = new ArrayList< >();
            eres.add("");
            return eres;
        }
        ArrayList<String> rowres =  new ArrayList<>();
        ArrayList<String> colres =  new ArrayList<>();

        if(sr<dr){
             rowres = getMazePaths(sr+1, sc, dr, dc); 
        }
        if(sc<dc){
            colres = getMazePaths(sr, sc+1, dr, dc);
        }
        ArrayList<String> res = new ArrayList<>();
        for(String val: rowres){
            res.add("h"+ val);
        }
        for(String val: colres){
            res.add("v"+ val);
        }
        return res;
    }
}
