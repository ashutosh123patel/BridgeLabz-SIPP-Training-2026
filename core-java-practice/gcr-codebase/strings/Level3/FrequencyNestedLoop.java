import java.util.Scanner;

public class FrequencyNestedLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] ch = s.toCharArray();

        int[] f = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {

            f[i] = 1;

            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {
                    f[i]++;
                    ch[j] = '0';
                }
            }
        }

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] != '0') {
                System.out.println(ch[i] + " : " + f[i]);
            }
        }
    }
}