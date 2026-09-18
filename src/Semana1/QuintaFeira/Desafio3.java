package Semana1.QuintaFeira;

public class Desafio3 {

    public boolean somaEIdentificaPariedade(int[] nums, int a, int b){
        int primeiro = nums[a];
        int segundo = nums[b];

        int soma = primeiro + segundo;

        return soma % 2 == 0;
    }
}
