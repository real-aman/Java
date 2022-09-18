//Finding max sum of subarray using prefix sum approch

class MaxSubarrayPrefixMethod{
    public static void getMaxsubarray(int arr[]){
        int prefix[]= new int[arr.length];
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;

        prefix[0]=arr[0];
        for(int i=1 ;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+ arr[i];
        }


        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currentSum = (start==0) ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
                }

            }
        
        System.out.print("Max sum is: "+maxSum);
        


    }


    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        getMaxsubarray(arr);



    }

}