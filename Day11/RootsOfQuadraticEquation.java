package Day11;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        double a = 3.4, b = 3, c = 9;
        double root1, root2, determinant;
        determinant = (b * b) - (4 * a * c);

        if (determinant == 0) {
            root1 = root2 = -b / 2 * (a);
            System.out.printf("Root of the given equation is %.2f", root1);

        } else if (determinant > 0) {
            root1 = -b + Math.sqrt(determinant);
            root2 = -b - Math.sqrt(determinant);
            System.out.printf("Root are %.2f , $.2f", root1, root2);
        } else if (determinant < 0) {
            double real = -b / 2 * (a);
            double imaginary = Math.sqrt(-determinant) / 2 * (a);
            System.out.printf(" Root is %.2f + %.2fi", real, imaginary);
            System.out.printf("\n Root is %.2f - %.2fi", real, imaginary);
        }

    }
}
