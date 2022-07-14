import java.util.Arrays;

class MaxAndMin {
    public static int[] maxAndMin(int[] nums) {
        int[] result = new int[2];
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        result[0] = min;
        result[1] = max;
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 34, 4, 5, 6, 67, 6, 0, 7, 89173987 };
        System.out.println(Arrays.toString(maxAndMin(nums)));
    }
}