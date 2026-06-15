import java.util.Scanner;

public class FactorOperations {

    public static int[] factors(int n) {

        int c = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        int[] arr = new int[c];
        int j = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[j++] = i;
            }
        }

        return arr;
    }

    public static int sum(int[] arr) {
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }

        return s;
    }

    public static int product(int[] arr) {
        int p = 1;

        for (int i = 0; i < arr.length; i++) {
            p *= arr[i];
        }

        return p;
    }

    public static double squareSum(int[] arr) {
        double s = 0;

        for (int i = 0; i < arr.length; i++) {
            s += Math.pow(arr[i], 2);
        }

        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = factors(n);

        System.out.print("Factors: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum = " + sum(arr));
        System.out.println("Product = " + product(arr));
        System.out.println("Sum of Squares = " + squareSum(arr));
    }
}