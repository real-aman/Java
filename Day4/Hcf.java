import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first the number: ");
        int number1=sc.nextInt();
        System.out.print("Enter second the number: ");
        int number2=sc.nextInt();
        int smaller=1,hcf=1;

        if(number1<number2){
            smaller=number1;
        }
        else{
            smaller=number2;
        }
        
        if(number1==0 && number2==0){
            System.out.println("Not define");
        }
        else if((number1==0) || (number2==0)){
            hcf=(number1==0)?number2:number1;
            System.out.print("HCF is: "+ hcf);
        }
        else{
            for(int i=1;i<=smaller;i++){
                if(number1%i==0 && number2%i==0){
                    hcf=i;
                }
            }
            System.out.print("HCF is: "+ hcf);

        }
        
        

        sc.close();
    }
    
}
