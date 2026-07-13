import java.util.HashMap;

public class APIRateLimiterWindow {

    public static int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        int maxLen = 0;
        for (int end = 0; end < keyIds.length; end++) {
            if (map.containsKey(keyIds[end])) {
                map.put(keyIds[end], map.get(keyIds[end]) + 1);
            } else {
                map.put(keyIds[end], 1);
            }
            while (map.size() > n) {
                map.put(keyIds[start], map.get(keyIds[start]) - 1);

                if (map.get(keyIds[start]) == 0) {
                    map.remove(keyIds[start]);
                }
                start++;
            }

            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] keyIds = {1, 2, 1, 3, 4, 2, 3};
        int n = 2;
        int ans = longestSubarrayWithAtMostNDistinct(keyIds, n);
        System.out.println("Longest Valid Window = " + ans);
    }
}