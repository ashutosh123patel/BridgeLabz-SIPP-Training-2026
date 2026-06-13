import java.util.Scanner;

public class CharacterType {

    public static String check(char c) {

        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);
        }

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        }

        if (c >= 'a' && c <= 'z') {
            return "Consonant";
        }

        return "Not a Letter";
    }

    public static String[][] data(String s) {

        String[][] arr = new String[s.length()][2];

        for (int i = 0; i < s.length(); i++) {
            arr[i][0] = String.valueOf(s.charAt(i));
            arr[i][1] = check(s.charAt(i));
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[][] arr = data(s);

        System.out.println("Char\tType");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }
}