class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;      // last element in nums1
        int j = n - 1;      // last element in nums2
        int k = m + n - 1;  // last position in nums1

        while(i >= 0 && j >= 0){

            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // If nums2 still has elements
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    // 🔽 Driver Code
    public static void main(String[] args) {

        Solution obj = new Solution();

        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};

        int m = 3;
        int n = 3;

        obj.merge(nums1, m, nums2, n);

        System.out.print("Merged array: ");

        for(int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i] + " ");
        }
    }
}