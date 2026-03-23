// Class to hold the solution logic
class Solution {
    // Function to remove duplicates from sorted array in-place
    public int removeDuplicates(int[] nums) {
        // If array is empty, return 0
        if (nums.length == 0) return 0;

        // Pointer for last unique element
        int i = 0;

        // Start from second element
        for (int j = 1; j < nums.length; j++) {
            // If new unique element is found
            if (nums[j] != nums[i]) {
                // Move unique position forward
                i++;
                // Place new unique element
                nums[i] = nums[j];
            }
        }

        // i is last index of unique element, count = i + 1
        return i + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);

        System.out.println("Unique count = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}
