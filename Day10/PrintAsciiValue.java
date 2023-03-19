package Day10;

import java.util.Scanner;

public class PrintAsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char c = sc.next().charAt(0);
        int value = c;
        System.out.print("ASCII value of " + c + " is " + value);
        sc.close();

    }
}
