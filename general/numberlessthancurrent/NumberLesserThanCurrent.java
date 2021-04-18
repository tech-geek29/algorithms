package general.numberlessthancurrent;

import java.util.Arrays;

public class NumberLesserThanCurrent {
    public static void main(String[] args) {
        int[] nums = new int[]{8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int cumulativeSum[] = new int[101];
        for(int n : nums){
            cumulativeSum[n]++;
        }
        int cs = 0;
        for(int i = 0; i < 101; i++){
            if(cumulativeSum[i] != 0){
                int t = cumulativeSum[i];
                cumulativeSum[i] = cs;
                cs += t;
            }
        }
        int k = 0;
        int ans[] = new int[nums.length];
        for(int n : nums){
            ans[k++] = cumulativeSum[n];
        }
        return ans;
    }
}
