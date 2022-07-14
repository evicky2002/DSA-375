import java.util.Arrays;

public class ReverseTheArray {
    public static int[] reverseTheArray(int[] nums) {
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
