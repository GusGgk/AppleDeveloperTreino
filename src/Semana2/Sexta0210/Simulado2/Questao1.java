package Semana2.Sexta0210.Simulado2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int maiorNumero = 0;
        int menorNumero = 0;


        int[] vetor = new int[n];

        for(int i = 0; i < n; i++){
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor.length == 1){
                maiorNumero = vetor[i];
                menorNumero = vetor[i];
            }
            if(i == 0){
                maiorNumero = vetor[i];
                menorNumero = vetor[i];
            }

            if (vetor[i] > maiorNumero){
                maiorNumero = vetor[i];
            }

            if(vetor[i] < menorNumero){
                menorNumero = vetor[i];
            }

        }
        int diferencaAbs = maiorNumero - menorNumero;
        System.out.println(diferencaAbs);
    }
}
