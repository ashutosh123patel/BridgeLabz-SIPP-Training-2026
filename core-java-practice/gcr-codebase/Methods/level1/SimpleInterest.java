import java.util.Scanner;

public class SimpleInterest {

    public static double si(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double s = si(p, r, t);

        System.out.println("The Simple Interest is " + s +
                " for Principal " + p +
                ", Rate of Interest " + r +
                " and Time " + t);
    }
}