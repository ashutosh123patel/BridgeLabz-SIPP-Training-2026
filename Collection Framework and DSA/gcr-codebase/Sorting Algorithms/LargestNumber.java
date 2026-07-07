import java.util.Arrays;

/**
 * LargestNumber
 */
public class LargestNumber {
    public static String largestNumber(int [] arr) {
        String[] str = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            str[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

        if (str[0].equals("0"))
            return "0";

        StringBuilder result = new StringBuilder();
        for (String s : str) {
            result.append(s);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 2 };
        System.out.println(largestNumber(arr));
    }
}