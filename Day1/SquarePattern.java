import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("For creating the square of N x N give the value of N: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
