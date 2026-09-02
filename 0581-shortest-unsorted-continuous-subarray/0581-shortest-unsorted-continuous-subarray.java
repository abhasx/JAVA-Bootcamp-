class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int left = n;
        int right = 0;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);

            if (nums[i] < max) {
                right = i;
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);

            if (nums[i] > min) {
                left = i;
            }
        }

        return right > left ? right - left + 1 : 0;
    }
}