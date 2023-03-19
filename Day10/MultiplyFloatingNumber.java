package Day10;

import java.util.Scanner;

public class MultiplyFloatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        float a = sc.nextFloat();
        System.out.print("Enter number: ");
        float b = sc.nextFloat();
        float result = a * b;
        System.out.print("Answer: " + result);
        sc.close();

    }

}
