import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string you want check Pallindrome or not: ");
        String str;
        boolean check= true;
        str=sc.nextLine();
        for(int i=1;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                check=false;
                break;
            }
            else{
                check=true;
            }

        }

        if(check==true){
            System.out.print("Pallindrome");
        }
        else{
            System.out.print("Not pallindrome");
        }
        
        sc.close();
        
    


    }
}
