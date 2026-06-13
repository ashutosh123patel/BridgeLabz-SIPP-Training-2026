import java.util.Scanner;

public class FrequencyUsingUnique {

    public static char[] unique(String s) {

        char[] t = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {

            boolean f = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    f = false;
                    break;
                }
            }

            if (f) {
                t[k++] = s.charAt(i);
            }
        }

        char[] arr = new char[k];

        for (int i = 0; i < k; i++) {
            arr[i] = t[i];
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] arr = unique(s);

        for (int i = 0; i < arr.length; i++) {

            int c = 0;

            for (int j = 0; j < s.length(); j++) {
                if (arr[i] == s.charAt(j)) {
                    c++;
                }
            }

            System.out.println(arr[i] + " : " + c);
        }
    }
}