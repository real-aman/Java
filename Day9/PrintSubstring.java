//printing substring from any start index to any end index(excluding end index)
public class PrintSubstring {
    public static void main(String[] args) {
        String str = "Helloworld";
        int start=2;
        int end=7;
        String copyStr="";
        
        //substring(start,end) is available in library

        for(int i=start;i<end;i++){
            copyStr+=str.charAt(i);
            
        }

        System.out.print("Substring is : "+ copyStr);
    }
}
