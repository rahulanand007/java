package l004_Recursion;
import java.util.*;

public class GetMazePathsWithJumps {

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
        }else if(sr > dr || sc > dc){
            ArrayList< String> eres = new ArrayList< >();
            return eres;
        }
        
        ArrayList<String> res = new ArrayList<>();

        for(int i=1; i<=dr-sr ;i++){
            ArrayList<String> rowres =  getMazePaths(sr+i, sc, dr, dc);
            for(String val: rowres){
                res.add("v"+ i + val);
            }  
        }
        
        for(int j=1; j<=dc-sc ;j++){
            ArrayList<String> colres =  getMazePaths(sr, sc+j, dr, dc);
            for(String val: colres){
                res.add("h"+ j + val);
            }
        }
        
        for(int k=1; k<=dc-sc && k<=dr-sr ;k++){
            ArrayList<String> digres =  getMazePaths(sr+k, sc+k, dr, dc);
            for(String val: digres){
                res.add("d"+ k + val);
            }
        }
        return res;
    }
    
}
