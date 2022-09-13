import java.util.*;

public class Factorial {

    public static int getFactorial(int x) {
        int f=1;
        for(int i=1;i<=x;i++){
            f=f*i;
        }
        return f;
        
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find its Factorial: ");
        int n=sc.nextInt();
        int result=getFactorial(n);
        System.out.println("Factorial is: "+result);
        sc.close();
        
    }
}
