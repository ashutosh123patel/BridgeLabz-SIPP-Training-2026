
import java.util.Scanner;

public class ArrayOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            int[] arr = {10, 20, 30, 40, 50};

            int i = sc.nextInt();

            System.out.println("Value at index " + i + ": " + arr[i]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid index!");

        } catch (NullPointerException e) {

            System.out.println("Array is not initialized!");
        }
    }
}
