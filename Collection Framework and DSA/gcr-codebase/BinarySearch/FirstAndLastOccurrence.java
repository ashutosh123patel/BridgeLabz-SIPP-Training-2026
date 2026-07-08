/**
 * FirstAndLastOccurrence
 */
public class FirstAndLastOccurrence {
    public int[] searchRange(int[] nums, int target) {
    return new int[]{findFirst(nums, target), findLast(nums, target)};
    }

    int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return last;
        
    }

    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        FirstAndLastOccurrence obj = new FirstAndLastOccurrence();

        int target = 8;
        int[] ans = obj.searchRange(nums, target);

        System.out.println("First Occurrence: " + ans[0]);
        System.out.println("Last Occurrence: " + ans[1]);
        
    }
}