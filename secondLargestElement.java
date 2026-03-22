class Solution {
    public static int secondLargestElement(int[] nums) {
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > large){
                second_large = large;
                large = nums[i];
            }
            else if(nums[i] > second_large && nums[i] != large){
                second_large = nums[i];
            }
        }

        if(second_large == Integer.MIN_VALUE){
            return -1; // edge case
        }

        return second_large;
    }

    public static void main(String[] args){
        int[] nums = {5, 5, 5, 5};
        System.out.println(secondLargestElement(nums));
    }
}
