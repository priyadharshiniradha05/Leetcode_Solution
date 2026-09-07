class TwoSum {
    int[] twoSum(int[] nums, int target) {
        int[] b = new int[2];
        int l = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    b[l++] = i;
                    b[l++] = j;
                }
            }
        }

        return b;
    }
}