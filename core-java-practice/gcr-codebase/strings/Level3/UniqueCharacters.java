import java.util.Scanner;

public class UniqueCharacters {

    public static int len(String s) {
        int c = 0;

        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
        }

        return c;
    }

    public static char[] unique(String s) {
        int n = len(s);

        char[] temp = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean f = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    f = false;
                    break;
                }
            }

            if (f) {
                temp[k++] = s.charAt(i);
            }
        }

        char[] arr = new char[k];

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] arr = unique(s);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}