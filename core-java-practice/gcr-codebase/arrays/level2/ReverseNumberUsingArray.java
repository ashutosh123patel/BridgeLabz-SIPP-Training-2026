package level2;

import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int digitCount = 0;

        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        int[] digits = new int[digitCount];

        temp = number;

        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] reverseDigits = new int[digitCount];

        for (int i = 0; i < digitCount; i++) {
            reverseDigits[i] = digits[digitCount - 1 - i];
        }

        System.out.print("Reversed Number: ");

        for (int digit : reverseDigits) {
            System.out.print(digit);
        }
    }
}