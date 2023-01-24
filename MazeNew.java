import java.util.ArrayList;
import java.util.Scanner;

public class MazeNew {
    static ArrayList<String> route( int c_row , int c_col , int d_row , int d_col){
        if(c_row == d_row && c_col == d_col){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list ;
            }
        if(c_row > d_row || c_col > d_col){
            ArrayList<String> list = new ArrayList<>();
            return list ;
        }
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> horizontal = route(c_row, c_col +1 , d_row, d_col);
        for(String s : horizontal){
            result.add( "H" + s );
        }
        ArrayList<String> vertical = route(c_row +1 , c_col, d_row, d_col);
        for(String s : vertical){
            result.add( "V" + s );
        }
        ArrayList<String> diagonal = route(c_row + 1, c_col + 1, d_row, d_col);
        for(String s : diagonal){
            result.add( "D" + s );
        }
        return result ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(route(a , b , c , d)); 
        scanner.close();
    }
}
