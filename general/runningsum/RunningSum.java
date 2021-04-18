package general.runningsum;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Running sum: " + Arrays.toString(runningSum(a)));
    }

    public static int[] runningSum(int[] nums) {
        int sum[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum[i] = i == 0 ? nums[i] : nums[i] + sum[i - 1];
        }
        return sum;
    }
}
