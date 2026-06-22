import java.io.BufferedReader;
import java.io.FileReader;

public class GroceryBillReader {

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader("bill.txt"));

            String s;

            int c = 0;

            while ((s = br.readLine()) != null) {

                System.out.println(s);

                c++;
            }

            br.close();

            System.out.println("Total Lines = " + c);

        } catch (Exception e) {

            System.out.println("File not found");
        }
    }
}