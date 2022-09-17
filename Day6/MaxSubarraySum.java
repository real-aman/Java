public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int max=Integer.MIN_VALUE;
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                maxSum=0;
                for(int k=start;k<=end;k++){
                    maxSum+=arr[k];
                

                }
                if(max<maxSum){
                    max=maxSum;
                }
            }            
        }
        System.out.println("Max subarray sum is: "+max);
    }
}
