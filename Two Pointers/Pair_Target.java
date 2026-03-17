//Leetcode- 167. Two Sum II - Input Array Is Sorted

class Pair_Target {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                return new int[]{left + 1, right + 1};
            } 
            else if (currentSum < target) {
                left++;
            } 
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Pair_Target obj = new Pair_Target();

        int numbers[] = {2,7,11,15};
        int target = 9;

        int result[] = obj.twoSum(numbers, target);

        System.out.println(result[0] + " " + result[1]);
    }
}