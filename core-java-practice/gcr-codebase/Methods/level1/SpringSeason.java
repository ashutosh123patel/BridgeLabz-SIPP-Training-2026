import java.util.Scanner;

public class SpringSeason {

    public static boolean spring(int m, int d) {

        return (m == 3 && d >= 20) ||
               (m == 4) ||
               (m == 5) ||
               (m == 6 && d <= 20);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int m = sc.nextInt();

        System.out.print("Enter day: ");
        int d = sc.nextInt();

        if (spring(m, d)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}