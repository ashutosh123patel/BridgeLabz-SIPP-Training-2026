/**
 * countsort its not statble.           
 */
public class Countsort {
    public static void main(String[] args) {
        int [] arr = { 5, 3, 8, 1, 2 };

        int max = arr[0];   
        for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

        int [] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int ind = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                freq[ind++] = i;
                freq[i]--;
            }
        }
       
        for(int i=0;i<arr.length;i++){
            System.out.println(freq[i]);
        }

    }
}

