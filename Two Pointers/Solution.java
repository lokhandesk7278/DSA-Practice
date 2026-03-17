//Leetcode - 26. Remove Duplicates from Sorted Array

class Solution {

    public static int removeDuplicates(int[] nums) {

        int i = 0; // slow pointer

        for(int j = 1; j < nums.length; j++){ // fast pointer

            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int nums[] = {0,0,1,1,1,2,2,3,3,4};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Updated array: ");

        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
    }
}