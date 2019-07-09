package edu.cnm.deepdive;

public class Array2 {

    public boolean either24(int[] nums) {
        Boolean twos = false;
        Boolean fours = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) twos = true;
            if (nums[i] == 4 && nums[i + 1] == 4) fours = true;
        }
        return twos ^ fours;
    }



    public int[] pre4(int[] nums) {

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 4 && i > 0) {
                int[] newNums;
                newNums = new int[i];
                for (int j = 0; j < newNums.length; j++)
                    newNums[j] = nums[j];
                if (nums[0] != 4) {
                    return newNums;
                }
            }
        int[] bar;
        bar = new int[0];
        return bar;
    }
}
