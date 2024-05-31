/**
 * Solution
 */
public class Solution {
    public int removeElement(int[] nums, int val) { //0,1,2,2,3,0,4,2 2
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val) {
                nums[index++]=nums[i];
                
            }
        }
        return index;
    }}
