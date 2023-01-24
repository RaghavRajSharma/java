import java.util.Scanner;

public class Seed {
    public static void main(String[] args) {
        System.out.println(" Check Number Is a Seed Of Its Own");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int no = scanner.nextInt();
        int b = n;
        int digit = 1;
        while(n>0)
        {
            int r = n % 10;
            digit = digit * r;
            n = n / 10;
        }
        if(b*digit == no)
        System.out.println("it is a seed");
        else
        System.out.println("not a seed");
        scanner.close();
    }
}
