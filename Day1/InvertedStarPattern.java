public class InvertedStarPattern {
    public static void main(String[] args) {
        int n=5; //number of lines in which star will get printed
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
