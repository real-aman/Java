import java.util.*;

public class LargestinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the capacity of Array: ");
        int capacity=sc.nextInt();
        int arr[]=new int[capacity];
        System.out.print("Enter the element of Array: ");
        for(int i=0;i<capacity;i++){
            arr[i]=sc.nextInt();
        }
        // This is minus infinity used from library 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<capacity;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.print("Max is: "+ max);
        sc.close();
    }
}
