import java.util.Scanner;

public class SplitWords {

    public static String[] words(String s) {
        int c = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                c++;
            }
        }

        String[] arr = new String[c];

        String w = "";
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                w += s.charAt(i);
            } else {
                arr[j++] = w;
                w = "";
            }
        }

        arr[j] = w;

        return arr;
    }

    public static boolean cmp(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine();

        String[] a = words(s);
        String[] b = s.split(" ");

        System.out.println("Result: " + cmp(a, b));
    }
}