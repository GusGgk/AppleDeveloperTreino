package Semana1.SegundaFeira;

import java.util.Arrays;

public class LeetCode1480 {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args){
        LeetCode1480 teste = new LeetCode1480();

        int[] resultado = teste.runningSum(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(resultado));
    }

}
