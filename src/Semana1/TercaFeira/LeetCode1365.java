package Semana1.TercaFeira;

import java.util.Arrays;

public class LeetCode1365 {
    public int[] smallerNumbersThanCurrent(int[] nums){
        int[] resultado = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int contador = 0;

            for(int j = 0; j < nums.length; j++){
                if (nums[j] < nums[i]){
                    contador++;
                }
            }
            resultado[i] = contador;
        }
        return resultado;
    }

    public static void main(String args[]){
        LeetCode1365 let = new LeetCode1365();

        int[] resultado = let.smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
        System.out.println(Arrays.toString(resultado));
    }
}
