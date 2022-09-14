public class ButterflyPattern {
    public static void main(String[] args) {
        int n=4;
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            
            }
            for(j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            
            }
            System.out.println();
        }

        for(i=n;i>=1;i--){

            for(j=1;j<=i;j++){
                System.out.print("*");
            
            }
            for(j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            
            }
                
            System.out.println();
        }




    }
        
        
}

    

