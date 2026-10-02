package Semana2;

import java.util.Scanner;

public class VetoresELacos {
    public static void main(String[] args){
        //Dado um número N de elementos de um vetor, leia N inteiros e imprima o maior e o índice dela
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int maiorNumero = 0;
        int indiceMaior = 0;

        int vet[] = new int[n];
        for (int i = 0; i < vet.length; i++){
            vet[i] = sc.nextInt();
        }
        for (int i = 0; i < vet.length; i++){
            if(maiorNumero == 0){
                maiorNumero = vet[i];
                indiceMaior = i;
            }
            if (vet[i] > maiorNumero){
                maiorNumero = vet[i];
                indiceMaior = i;
            }
        }
        System.out.println("Maior = " + maiorNumero);
        System.out.println("Indice = " + indiceMaior);

    }
}
