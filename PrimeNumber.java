import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Find Prime no.");
        Scanner scanner = new Scanner(System.in);{
        int  a = scanner.nextInt();
        int count = 0;
        //for(int i = 1; i <=a; i++) {
        for(int i=2;i<=a-1;i++) {
           if(a%i==0) 
            count++;
        }
        //System.out.println(count>2?"not a prime no":"prime no.");
        System.out.println(count>0?"not prime no.":"prime no.");
        scanner.close();
        }
    }
}
