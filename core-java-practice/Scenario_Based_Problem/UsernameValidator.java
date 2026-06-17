import java.util.Scanner;

public class UsernameValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();

       int n = name.length();

        if(name.contains(" ")){
            System.out.println("Yes the Username contains the spaces");
        }else {
            System.out.println("No spaces are there in the user name");
        }

        int charcount = name.replace(" ","").length();
        System.out.println("The total no of the characters in the username is :" + charcount);

        System.out.println(name.toUpperCase());
    }

}