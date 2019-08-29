class Solution {
    // Time Complexity: O(n+m);
    // could be O(log(n+m));
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int[] nums = new int[total];
        int i = 0, j = 0;
        int cur = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                nums[cur++] = nums1[i++];
            } else {
                nums[cur++] = nums2[j++];
            }
        }
        
        while(i < nums1.length) {
            nums[cur++] = nums1[i++];
        }
        
        while(j < nums2.length) {
            nums[cur++] = nums2[j++];
        }
        
        if(total % 2 != 0 ){
            return (double)nums[total/2];
        } else {
            return (double)(nums[total/2 - 1] + nums[total/2])/2;
        }
    }
}
