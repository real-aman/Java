public class CharcterPattern {
    public static void main(String[] args) {
        int n=4;
        char word='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(word);
                word++;
            }
            System.out.println();
        }
    }
}
