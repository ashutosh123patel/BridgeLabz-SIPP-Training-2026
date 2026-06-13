import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] freq(String s) {

        int[] f = new int[256];

        for (int i = 0; i < s.length(); i++) {
            f[s.charAt(i)]++;
        }

        int c = 0;

        for (int i = 0; i < 256; i++) {
            if (f[i] > 0) {
                c++;
            }
        }

        String[][] arr = new String[c][2];

        int k = 0;

        for (int i = 0; i < 256; i++) {
            if (f[i] > 0) {
                arr[k][0] = String.valueOf((char)i);
                arr[k][1] = String.valueOf(f[i]);
                k++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[][] arr = freq(s);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " : " + arr[i][1]);
        }
    }
}