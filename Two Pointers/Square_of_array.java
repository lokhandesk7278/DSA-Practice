class Solution {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }

    // 🔽 Driver Code
    public static void main(String[] args) {

        Solution obj = new Solution();

        int nums[] = {-4, -1, 0, 3, 10};

        int result[] = obj.sortedSquares(nums);

        System.out.print("Sorted Squares: ");

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}