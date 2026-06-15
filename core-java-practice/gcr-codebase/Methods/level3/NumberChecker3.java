import java.util.Scanner;

public class NumberChecker3 {

    public static int[] rev(int[] arr) {

        int[] r = new int[arr.length];

        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            r[j++] = arr[i];
        }

        return r;
    }

    public static boolean equal(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = String.valueOf(n);

        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }

        int[] r = rev(arr);

        System.out.println("Palindrome = " + equal(arr, r));

        boolean d = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                d = true;
            }
        }

        System.out.println("Duck = " + d);
    }
}