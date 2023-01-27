import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println(" ***** Pattern ***** ");
        System.out.println("Enter Value To Print Pattern");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i <=a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" x ");
            }
        System.out.println();
        }
        System.out.println(" ***** Reverse Pattern ***** ");
        for (int i = 0; i <= a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print(" x ");
            }
        System.out.println();
        }
        scanner.close();
    }
}
