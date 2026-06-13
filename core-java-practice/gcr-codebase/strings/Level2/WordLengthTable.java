import java.util.Scanner;

public class WordLengthTable {

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

    public static String[][] data(String[] arr) {
        String[][] d = new String[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            d[i][0] = arr[i];
            d[i][1] = String.valueOf(len(arr[i]));
        }

        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[][] d = data(words(s));

        System.out.println("Word\tLength");

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i][0] + "\t" + Integer.parseInt(d[i][1]));
        }
    }
}