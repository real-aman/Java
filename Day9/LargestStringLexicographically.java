//Lexicographical means in order of alphabetet 
import java.lang.String;
public class LargestStringLexicographically{
    public static void main(String[] args) {
     // compareTo or (comparetoIgnorecase) function is there to compare string lexicographically if output is zero its same, if -ve its less then other and vice versa
    String fruits[]={"apple","watermelon","mango","orange","banana"};
    String largest=fruits[0];
    
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
            
        }
        System.out.println("Largest is: "+largest);
    }
}
