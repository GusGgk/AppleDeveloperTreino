package Semana2.Sexta0210;

import java.util.Scanner;

public class VetoresELogica {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        for(int i = 0; i < vetor.length; i++){
            int numeroSubs = 0;
            if (vetor[i] < 0){
                vetor[i] = numeroSubs;
            }
        }

        for (int i : vetor){
            System.out.print(i + " ");
        }

    }
}
