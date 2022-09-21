//stringbuilder is mutable and can change the value of that string (without creating copy in memory as like in String )

public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder stb=new StringBuilder("Alphabets: ");
        for(char ch='A';ch<='Z';ch++){
            stb.append(ch);
        }
        System.out.print(stb);
    }
    
}
