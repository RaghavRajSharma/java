import java.util.Scanner;

public class IsANumberPowerOf2 {
    int c = 1;
    static boolean power(int num , int compute){
        if(num==2)
        {
            return true;
        }
        if (num==compute){
            return true;
        }
        else if (num!= compute){
            return false;
        }
        compute = compute * 2;
        return power(num, compute);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        boolean result =power(a,1);
        System.out.println(result);
        scanner.close();
    }
}
