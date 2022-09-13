import java.util.*;
public class PrimeinRange {

    public static boolean checkPrime(int x){
        if(x==1){
            return false;
        }
        else if(x==2){
            return true;
        }
        else{
            for(int i=2;i<x;i++){
                if(x%i==0){
                    return false;

                }
                
    
            }
        }
        return true;
        

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto which you want to print the prime numbers: ");
        int n=sc.nextInt();  
        for(int i=2;i<=n;i++){
            if(checkPrime(i)==true){
                System.out.print(i+" ");
            }

        }
        sc.close();
    }
    
}
