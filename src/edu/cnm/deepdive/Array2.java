package edu.cnm.deepdive;

public class Array2 {

    public boolean either24(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] == 2) && (i < nums.length -1) && (nums.length > 1) && (nums[i+1] == 2));
            return true;
        }
        for (int j = 0; j < nums.length; j++) {
            if((nums[j] == 4) && (j < nums.length-1) && (nums.length > 1) && (nums[j+1] ==4));
            return true;
        }
        return false;

    }




    public int[] pre4(int[] nums){

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4) count++;
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++)
            result[i] = nums[i];

        return result;
    }
}
