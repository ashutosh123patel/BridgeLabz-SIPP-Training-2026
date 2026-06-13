import java.util.Scanner;

public class CharacterArrayComparison {

    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] customArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareArrays(customArray, builtInArray);

        System.out.print("Custom Array: ");
        for (char ch : customArray) {
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.print("Built-in Array: ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("Arrays are equal: " + result);
    }
}