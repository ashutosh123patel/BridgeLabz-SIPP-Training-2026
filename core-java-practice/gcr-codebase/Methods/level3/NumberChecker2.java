import java.util.Scanner;

public class NumberChecker2 {

    public static int[] digits(int n) {

        int c = 0;
        int t = n;

        while (t > 0) {
            c++;
            t /= 10;
        }

        int[] arr = new int[c];

        for (int i = c - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = digits(n);

        int s = 0;
        int sq = 0;

        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            sq += Math.pow(arr[i], 2);
        }

        System.out.println("Sum = " + s);
        System.out.println("Square Sum = " + sq);
        System.out.println("Harshad = " + (n % s == 0));

        int[] f = new int[10];

        for (int i = 0; i < arr.length; i++) {
            f[arr[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (f[i] > 0) {
                System.out.println(i + " : " + f[i]);
            }
        }
    }
}