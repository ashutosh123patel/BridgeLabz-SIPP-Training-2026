import java.io.FileWriter;
import java.util.Scanner;

public class ExpenseLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Category: ");
            String c = sc.nextLine();

            System.out.print("Amount: ");
            int a = sc.nextInt();

            FileWriter fw =
                    new FileWriter("expenses.txt", true);

            fw.write(c + " - " + a);
            fw.write("\n");

            fw.close();

            System.out.println("Expense Saved");

        } catch (Exception e) {

            System.out.println("Error");
        }
    }
}