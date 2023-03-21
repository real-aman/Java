package Day11;

import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        System.out.print("Enter the word: ");
        Scanner sc = new Scanner(System.in);
        char word = Character.toLowerCase(sc.next().charAt(0));
        if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
            System.out.print("Word is Vowel");

        } else {
            System.out.print("Word is Consonant");
        }
        sc.close();
    }
}