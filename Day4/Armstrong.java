import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number you want to check Armstrong: ");
        int number=sc.nextInt();
        int pow=0,quot=1,rem=1,ans=1,result=0,checkNumber=number, numberCopy=number;
        
        while(ans!=0){
            ans=checkNumber/10;
            checkNumber=ans;
            pow++;
        }
        
        while(quot!=0){
            
            rem=numberCopy%10;
            quot=numberCopy/10;
            result+=(int)(Math.pow((double)rem,(double)pow));
            numberCopy=quot;
        }

        if(number==result){
            System.out.println("Armstrong number");
        }
        else{
            System.out.print("Not an Armstrong");
        }

        sc.close();


    }
}
