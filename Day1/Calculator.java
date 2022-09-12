import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1=sc.nextDouble();
        System.out.print("Enter the second number: ");
        double number2=sc.nextDouble();
        System.out.print("Type the operation you want to perform among '+','-','*','/','%': ");
        char operation=sc.next().charAt(0);
        double result;
        switch (operation){
            case '+':
                result=number1+number2;
                System.out.println("Answer is: "+ result);
                break;
            case '-':
                result=number1-number2;
                System.out.println("Answer is: "+ result);
                break;  
            case '*':
                result=number1*number2;
                System.out.println("Answer is: "+ result);
                break;
            case '/':
                result=number1/number2;
                System.out.println("Answer is: "+ result);
                break;
            case '%':
                result=number1%number2;
                System.out.println("Answer is: "+ result);
                break;  
            default:
                System.out.println("You enter an invalid input");
                break;
        }
        sc.close();
        
    }
}
