class ReverseArray{

    public static void getReverse(int arr[]){
        int start=0;
        int end=(arr.length)-1;
        while(start<end){

            //swap
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    


    }


    public static void main(String[] args) {
        int arr[]={1,3,7,9,8};
        getReverse(arr);
        System.out.print("Reversed Array is: ");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+ " ");
        }

    }    
}
