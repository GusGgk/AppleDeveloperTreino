package Semana1.SegundaFeira;

import java.util.Arrays;

public class Desafio3 {
    //receber um array de int nums de tamanho n
    //retornar um novo array de tamanho 2n que seja a
    //repetição do array original duas vezes seguidas

    //ex 1,2,1
    //saida 1,2,1,1,2,1
    public int[] getConcatenation(int[] nums){
        int n = nums.length;
        int [] ans = new int[2 * n];

        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Desafio3 ex = new Desafio3();

        int[] resultado = ex.getConcatenation(new int[]{1, 2, 1});
        System.out.println(Arrays.toString(resultado)); // Deve imprimir: [1, 2, 1, 1, 2, 1]
    }
}
