class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int fullLength = nums1.length + nums2.length;
        int midCount = 2 - (fullLength % 2);
        int cnt = fullLength >> 1;
        double mid = 0;

        int i = 0;
        int j = 0;

        while (cnt >= 0) {
            int tmpMid;

            if (i < nums1.length && j < nums2.length) {
                tmpMid = (nums1[i] > nums2[j]) ? nums2[j++] : nums1[i++];
            } else {
                tmpMid = (i >= nums1.length) ? nums2[j++] : nums1[i++];
            }

            if (cnt < midCount) {
                mid += tmpMid;
            }
            cnt--;
        }

        return mid / midCount;
    }
}