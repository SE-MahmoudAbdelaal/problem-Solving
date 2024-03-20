class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return null; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        Solution s = new Solution();
        int[] result = s.twoSum(arr, 5);
        if (result != null) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
