import java.util.Scanner;

public class SmallestLargest {

    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {

        int s = n1;
        int l = n1;

        if (n2 < s) {
            s = n2;
        }

        if (n3 < s) {
            s = n3;
        }

        if (n2 > l) {
            l = n2;
        }

        if (n3 > l) {
            l = n3;
        }

        return new int[]{s, l};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] a = findSmallestAndLargest(n1, n2, n3);

        System.out.println("Smallest = " + a[0]);
        System.out.println("Largest = " + a[1]);
    }
}