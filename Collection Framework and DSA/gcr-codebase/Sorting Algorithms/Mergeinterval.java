
/**
 * Mergeinterval
 */
import java.util.*;

public class Mergeinterval {

    public static int[][] mergeInterval(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int size = intervals.length;
        for (int i = 0; i < size - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
               intervals[i][1]= Math.max(intervals[i][1], intervals[i+1][1]);
               for (int j = i + 1; j < size - 1; j++) {
                    intervals[j] = intervals[j + 1];
                }

                size--;

                i--;
            }
        }
        int ans [][] = new int [size][2];
        for(int i=0;i<size;i++){
            ans[i] = intervals[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        int[][] intervals =  { {1,4},{4,5},{2,9}};
        int[][] ans = mergeInterval(intervals);

        for (int[] interval : ans) {
            System.out.println(Arrays.toString(interval));
        }
    }
}