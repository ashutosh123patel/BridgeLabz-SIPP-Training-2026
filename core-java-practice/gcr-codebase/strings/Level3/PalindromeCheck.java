import java.util.Scanner;

public class PalindromeCheck {

    public static boolean m1(String s) {

        int st = 0;
        int end = s.length() - 1;

        while (st < end) {

            if (s.charAt(st) != s.charAt(end)) {
                return false;
            }

            st++;
            end--;
        }

        return true;
    }

    public static boolean m2(String s, int st, int end) {

        if (st >= end) {
            return true;
        }

        if (s.charAt(st) != s.charAt(end)) {
            return false;
        }

        return m2(s, st + 1, end - 1);
    }

    public static char[] rev(String s) {

        char[] arr = new char[s.length()];

        int k = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            arr[k++] = s.charAt(i);
        }

        return arr;
    }

    public static boolean m3(String s) {

        char[] a = s.toCharArray();
        char[] b = rev(s);

        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(m1(s));
        System.out.println(m2(s, 0, s.length() - 1));
        System.out.println(m3(s));
    }
}
