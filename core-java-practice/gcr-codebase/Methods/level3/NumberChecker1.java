import java.util.Scanner;

public class NumberChecker1 {

    public static int count(int n) {

        int c = 0;

        while (n > 0) {
            c++;
            n /= 10;
        }

        return c;
    }

    public static int[] digits(int n) {

        int c = count(n);

        int[] arr = new int[c];

        for (int i = c - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }

        return arr;
    }

    public static boolean duck(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public static boolean armstrong(int n, int[] arr) {

        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            s += Math.pow(arr[i], arr.length);
        }

        return s == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = digits(n);

        int l1 = Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;

        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > l1) {
                l2 = l1;
                l1 = arr[i];
            } else if (arr[i] > l2) {
                l2 = arr[i];
            }

            if (arr[i] < s1) {
                s2 = s1;
                s1 = arr[i];
            } else if (arr[i] < s2) {
                s2 = arr[i];
            }
        }

        System.out.println("Duck = " + duck(arr));
        System.out.println("Armstrong = " + armstrong(n, arr));
        System.out.println("Largest = " + l1);
        System.out.println("Second Largest = " + l2);
        System.out.println("Smallest = " + s1);
        System.out.println("Second Smallest = " + s2);
    }
}