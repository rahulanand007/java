package l004_Recursion;
import java.util.*;

public class PrintMazePathsWithJumps {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        printMazePathsWithJumps(1, 1, n, m, "");
        scn.close(); 
    }

    public static void printMazePathsWithJumps(int sr, int sc,int dr,int dc, String ans){
        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
        for(int j=1; j<dc;j++){
            printMazePathsWithJumps(sr, sc+j, dr, dc, ans+"h"+j);
        }
        for(int i=1 ; i<dr;i++){
            printMazePathsWithJumps(sr+i, sc, dr, dc, ans+"v"+i);
        }
        
        for(int k=1; k<dc&& k<sr;k++){
            printMazePathsWithJumps(sr+k, sc+k, dr, dc, ans+"d"+k);
        }
    }
}
