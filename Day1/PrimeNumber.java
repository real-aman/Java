import java.util.*;

public class PrimeNumber{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number you want to check prime or not: ");
            int number=sc.nextInt();
            int i=0;
            boolean isPrime=true;
            if(number<=1){
                isPrime=false;
            }
            else if(number==2){
                isPrime=true;

            }
            else{
                for(i=2;i<number;i++){
                    if(number%i==0){
                        isPrime=false;
                        break;
                    }
                    else{
                        isPrime=true;
                    }
                }
            }

            if(isPrime==true){
                System.out.println("Prime number");
            }
            else{
                System.out.println("Not Prime");
            }
            sc.close();
        }

    }
