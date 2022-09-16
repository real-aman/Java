import java.util.Scanner;

public class BinarySearch {

    public static int getIndex(int arr[],int key){
        int start=0;
        int end=(arr.length)-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
        }
        return -1;

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,5,8,12,9,1};
        System.out.print("Enter the element of Array you want to find the index : ");
        int key=sc.nextInt();
        int index=getIndex(arr,key);
        System.out.println("Element is at index: "+index);
        sc.close();
    }
}
