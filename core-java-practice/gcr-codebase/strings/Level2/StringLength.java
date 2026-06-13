import java.util.Scanner;

public class StringLength {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.next();

        System.out.println("Length by method: " + len(s));
        System.out.println("Length by length(): " + s.length());
    }
}