package Semana1.SegundaFeira;

import java.util.Arrays;

public class Desafio4 {
    //receber array de int e retornar o maior e menor valor
    //3,1,4,5
    //5,1

    public int[] maiorEMenor(int[] nums){
        int maiorValor = nums[0];
        int indiceDoMaior = 0;

        for (int i = 1; i < nums.length; i++){
            if(nums[i] > maiorValor){
                maiorValor = nums[i];
                indiceDoMaior = i;
            }
        }
        return new int[] {maiorValor, indiceDoMaior};
    }

    public static void main(String[] args) {
        Desafio4 teste = new Desafio4();

        int[] resultado = teste.maiorEMenor(new int[]{3, 8, 2, 5});

        // Imprime bonito no console
        System.out.println(Arrays.toString(resultado)); // Saída esperada: [8, 1]
    }
}
