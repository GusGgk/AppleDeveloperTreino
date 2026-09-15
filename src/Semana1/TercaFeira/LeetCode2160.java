package Semana1.TercaFeira;

import java.util.Arrays;

public class LeetCode2160 {
    public int minimumSum(int num){
        int[] digitos = new int[4];

        for(int i = 0; i < 4; i++){
            digitos[i] = num % 10;
            num = num / 10;
        }

        Arrays.sort(digitos);

        int new1 = digitos[0] * 10 + digitos[2];
        int new2 = digitos[1] * 10 + digitos[3];

        // 5. Retorna a soma mínima (23 + 29 = 52)
        return new1 + new2;
    }

    public static void main(String[] args) {
        LeetCode2160 teste = new LeetCode2160();
        System.out.println(teste.minimumSum(2932)); // Imprime 52
        System.out.println(teste.minimumSum(4009)); // Imprime 13
    }
}
