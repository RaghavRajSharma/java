//Simple Calculator with switch case.

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("**** Switch Case ****");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Division");
        System.out.println("Enter Your Choice");
        int a = scanner.nextInt();
        System.out.println("Enter First Number");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        int num2 = scanner.nextInt();
        int result = 0;
        switch(a){
            case 1:{
                System.out.println("Addition");
                result = num1 + num2;
                break;
            }
            case 2:{
                System.out.println("Subtraction");
                result = num1 - num2;
                break;
            }case 3:{
                System.out.println("Multiplication");
                result = num1 * num2;
                break;
            }case 4:{
                System.out.println("Division");
                result = num1 / num2;
                break;
            }
            default:{
                System.out.println("Invalid operation");
            }
        }
        System.out.println(result);       
        scanner.close();
    }
}
