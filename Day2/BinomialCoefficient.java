import java.util.*;

public class BinomialCoefficient {

    public static int getFactorial(int x) {
        int f=1;
        for(int i=1;i<=x;i++){
            f=f*i;
        }
        return f;
        
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r=sc.nextInt();
        int nFactorial=getFactorial(n);
        int rFactorial=getFactorial(r);
        int nminusrFactorial=getFactorial(n-r);
        int result=nFactorial/((rFactorial)*(nminusrFactorial));
        System.out.println("Binomial coefficient is: "+result);
        sc.close();
        
    }
}

