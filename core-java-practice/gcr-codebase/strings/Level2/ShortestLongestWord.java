import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] words(String s) {
        return s.split(" ");
    }

    public static int[] find(String[] arr) {
        int min = 0;
        int max = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < arr[min].length()) {
                min = i;
            }

            if (arr[i].length() > arr[max].length()) {
                max = i;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] arr = words(s);

        int[] a = find(arr);

        System.out.println("Shortest: " + arr[a[0]]);
        System.out.println("Longest: " + arr[a[1]]);
    }
}