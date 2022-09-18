//Finding max sum of subarray using kadane's algorithm

public class KadanesAlgorithm {
    public static void KadanesMethod(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            if(cs>ms){
                ms=cs;
            }
        }
        
        System.out.println("Max sum of subarray is:"+ms);
    }

    public static void main(String[] args) {
        int arr[]={-1,-5,4,3,6,-9};
        KadanesMethod(arr);
    }
}
