import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first the number: ");
        int number1=sc.nextInt();
        System.out.print("Enter second the number: ");
        int number2=sc.nextInt();

        int higher,smaller, result,lcm=0;
        if(number1>number2){
            higher=number1;
            smaller=number2;
        }
        else{
            higher=number2;
            smaller=number1;
        }

        for(int i=1;i<=i;i++){
            result=higher*i;
            if(result%smaller==0){
                lcm=result;
                break;
            }
        }

        System.out.println("LCM is: "+lcm);

    
    
    
    
    }
}
