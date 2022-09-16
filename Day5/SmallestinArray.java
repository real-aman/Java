import java.util.Scanner;

//Finding Smallest Using method in class
public class SmallestinArray {

    public static int getSmallest(int arr[]){
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max>arr[i]){
                
                max=arr[i];
            
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of Array: ");
        int capacity=sc.nextInt();
        int arr[]=new int[capacity];
        System.out.print("Enter the element of Array: ");
        for(int i=0;i<capacity;i++){
            arr[i]=sc.nextInt();
        }
        
        int smallest=getSmallest(arr);
        System.out.println("Smallest element is: "+smallest);
        sc.close();
    }
}
