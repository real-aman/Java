package Day10;

import java.util.Scanner;

public class PrintInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to print: ");
        int num = sc.nextInt();
        System.out.print("Entered number is " + num);
        sc.close();

    }
}
