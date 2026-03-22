import java.util.*;

class Solution {
    long countTriplets(int n, int sum, long arr[]) {

        Arrays.sort(arr);
        long count = 0;

        for(int i = 0; i < n - 2; i++){

            int left = i + 1;
            int right = n - 1;

            while(left < right){

                long currSum = arr[i] + arr[left] + arr[right];

                if(currSum < sum){
                    count += (right - left);
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int n = 4;
        int sum = 2;
        long arr[] = {-2, 0, 1, 3};

        long result = obj.countTriplets(n, sum, arr);

        System.out.println("Count of triplets: " + result);
    }
}