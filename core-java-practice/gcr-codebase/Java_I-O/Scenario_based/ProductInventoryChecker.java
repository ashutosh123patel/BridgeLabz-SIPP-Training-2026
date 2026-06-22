import java.io.BufferedReader;
import java.io.FileReader;

public class ProductInventoryChecker {

    public static void main(String[] args) {

        try {

            BufferedReader br =new BufferedReader(new FileReader("inventory.txt"));
            String s;
            while ((s = br.readLine()) != null) {

                String[] arr = s.split("-");

                String p = arr[0];
                int q = Integer.parseInt(arr[1]);

                if (q == 0) {
                    System.out.println(p + " is out of stock");
                }
            }
            br.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}