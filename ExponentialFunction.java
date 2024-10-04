import java.util.*;

public class ExponentialFunction {
    public static int calculateExponent(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base (x) : ");
        int x = sc.nextInt();
        System.out.println("Enter the exponent (n) : ");
        int n = sc.nextInt();
        int result = calculateExponent(x, n);
        System.out.println(x + " raised to power of " + n + " is : " + result);
    }
}