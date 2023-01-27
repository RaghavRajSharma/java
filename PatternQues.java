public class PatternQues {
    static void printStar(int col){
        if (col == 0){
            return ;
        } 
        System.out.print(col);
        printStar(col - 1);
    }
    static void pattern(int row ,int col){
        if(row==0){
            return ;
        }

        printStar(col);
        System.out.println();
        pattern(row -1, col - 1);
    }
    public static void main(String[] args) {
        pattern(5,5);
    }
}
