class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]+nums[i+1]==target){
                a[0]=i;
                a[1]=i+1;
                break;

            }
        }
         return a;
    }
}