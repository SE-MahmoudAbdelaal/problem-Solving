import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> hashSet=new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);     
        }
        int index=0;
        for (Integer hasset : hashSet) {
            nums[index]=hasset;
            index++;
            
        }
        return index;
        
    }
}