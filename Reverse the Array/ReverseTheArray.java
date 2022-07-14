import java.util.Arrays;

public class ReverseTheArray {
    public static int[] reverseTheArray(int[] nums) {
        // Store the moving forward index at position
        // Loop through the length of the array
        // Store the last value of array in temp always
        // Move the rest of the elements one position to the right
        // After moving, we would have the moving forward index free to be occupied by
        // the temp
        // Now increment position and repeat until the array is reversed
        int position = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[nums.length - 1];
            int j;
            for (j = nums.length - 1; j > position; j--) {
                nums[j] = nums[j - 1];
            }
            nums[position] = temp;
            position++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(Arrays.toString(reverseTheArray(nums)));
    }
}
