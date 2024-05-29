import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int counter=0;
        while (counter<n){
            nums1[m]=nums2[counter];
            m++;
            counter++;
        }
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = i+1; j <nums1.length ; j++) {
                int tempValue=0;
                if (nums1[i]>nums1[j]){
                    tempValue=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=tempValue;
                }

            }
        }
    }
}