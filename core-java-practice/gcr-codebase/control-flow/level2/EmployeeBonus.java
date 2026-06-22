import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        int y = sc.nextInt();

        double b;

        if (y > 5) {
            b = sal * 0.05;
        } else {
            b = 0;
        }

        System.out.println("Bonus = " + b);
    }
}