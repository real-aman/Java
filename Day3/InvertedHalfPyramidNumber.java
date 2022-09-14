public class InvertedHalfPyramidNumber {
    public static void main(String[] args) {
        int n=5;
        int counter=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-counter;j++){
                System.out.print(j);
                
            }
            counter++;
            System.out.println();
        }
    }
}
