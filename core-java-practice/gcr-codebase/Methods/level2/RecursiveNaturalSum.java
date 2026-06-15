import java.util.Scanner;

public class RecursiveNaturalSum {

    public static int rec(int n) {

        if (n == 1) {
            return 1;
        }

        return n + rec(n - 1);
    }

    public static int formula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid");
            return;
        }

        int a = rec(n);
        int b = formula(n);

        System.out.println("Recursive = " + a);
        System.out.println("Formula = " + b);
        System.out.println(a == b);
    }
}