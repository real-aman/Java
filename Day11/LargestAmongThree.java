package Day11;

public class LargestAmongThree {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int c = 11;
        int largest;
        if (a > b) {
            if (c > a) {
                largest = c;
            } else {
                largest = a;
            }

        } else {
            if (c > b) {
                largest = c;
            } else {
                largest = b;
            }

        }
        System.out.print("Largest is: " + largest);
    }

}
