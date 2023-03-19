package Day10;

import java.util.Scanner;

public class FindQuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int a = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int b = sc.nextInt();
        int rem = a % b;
        int quo = a / b;
        System.out.print("Reminder is " + rem + " Quotient is " + quo);
        sc.close();

    }
}
