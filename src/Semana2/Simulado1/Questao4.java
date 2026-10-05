package Semana2.Simulado1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] vetor = new int[n];
        int[] vetorBinario = new int[n];

        for(int i = 0; i < n; i++){
            vetor[i] = sc.nextInt();
        }

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                vetorBinario[i] = 0;
            } else {
                vetorBinario[i] = 1;
            }
        }

        for(int i : vetorBinario){
            System.out.print(vetorBinario[i] + " ");
        }

    }
}
