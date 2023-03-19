package Day10;

import java.util.Scanner;

public class AddTwoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.print("Result is " + c);
        sc.close();

    }

}
