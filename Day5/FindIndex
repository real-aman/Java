import java.util.Scanner;

class FindIndex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the capacity of Array: ");
        int capacity=sc.nextInt();
        int arr[]=new int[capacity];
        System.out.print("Enter the elements of Array: ");
        for(int i=0;i<capacity;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Enter the element of Array you want to find the index: ");
        int element=sc.nextInt();
        int index[]=new int[capacity];
        int count=0;

        for(int j=0;j<capacity;j++){
            if(arr[j]==element){
                index[count]=j;
                count++;

            }
            

        }

        if(count==0){
                index[0]=-1;
                System.out.println("Element not found");
                System.out.print("Still ");
        }

        System.out.print("Index at ");
        int i=0;
        do{
            System.out.print(index[i]+ " ");
            i++;
        }while(i<count);

        sc.close();


    }
}
