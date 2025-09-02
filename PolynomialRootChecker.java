import java.util.Scanner;

public class PolynomialRootChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read coefficients a, b, c and the value x
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        // Evaluate the polynomial ax^2 + bx + c
        int result = a * x * x + b * x + c;

        // Print "root!" if result is 0, otherwise "not root!"
        System.out.println(result == 0 ? "root!" : "not root!");
    }
}