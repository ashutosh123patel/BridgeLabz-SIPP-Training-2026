import java.util.Random;

public class FootballTeamStats {

    public static int sum(int[] arr) {

        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }

        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {

        int m = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < m) {
                m = arr[i];
            }
        }

        return m;
    }

    public static int max(int[] arr) {

        int m = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }

        return m;
    }

    public static void main(String[] args) {

        Random r = new Random();

        int[] h = new int[11];

        for (int i = 0; i < h.length; i++) {
            h[i] = r.nextInt(101) + 150;
        }

        System.out.println("Mean = " + mean(h));
        System.out.println("Shortest = " + min(h));
        System.out.println("Tallest = " + max(h));
    }
}