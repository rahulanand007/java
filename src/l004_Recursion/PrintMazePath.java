package l004_Recursion;
import java.util.*;

public class PrintMazePath {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), m = scn.nextInt();
        printMazePaths(1, 1, n, m, "");
        scn.close(); 
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans){
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
        if(sc<dc){
            printMazePaths(sr, sc+1, dr, dc, ans + "h");
        }
        if(sr<dr){
            printMazePaths(sr+1, sc, dr, dc, ans + "v");
        }    
    }
}
