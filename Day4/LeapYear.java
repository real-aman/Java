import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number you want to check leap year or not: ");
        int year=sc.nextInt();
        boolean isLeap=false;

        if(year%400==0){
            isLeap=true;

        }
        else if(year%4==0 && year%100!=0){
            isLeap=true;
        }
        else{
            isLeap=false;
        }

        if(isLeap==true){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
        sc.close();
    }
    
}
