package Semana1.TercaFeira;

public class LeetCode3945 {
    public int digitFrequencyScore(int n) {
        String texto = String.valueOf(n);
        int soma = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Apenas processa se for a PRIMEIRA vez que esse dígito aparece
            if (texto.indexOf(c) == i) {
                int atual = c - '0'; // Pega o valor numérico real
                int contador = 0;   // Zera o contador para o dígito atual

                // Conta quantas vezes 'atual' aparece no número
                for (int j = 0; j < texto.length(); j++) {
                    if (texto.charAt(j) == c) {
                        contador++;
                    }
                }

                // Fora do laço j: multiplica o dígito pela sua frequência e soma
                soma += atual * contador;
            }
        }

        return soma;
    }
    public static void main(String args[]){
        LeetCode3945 lista = new LeetCode3945();

    }
}
