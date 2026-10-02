package Semana2.Sexta0210.maisExercicios;
import java.util.Scanner;

public class VetoresELogica {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int  n = sc.nextInt();
        sc.nextLine();

        int[] vetor = new int[n];
        int menorNumero = 0;
        int indiceMenor = 0;

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }

        for(int i = 0; i < vetor.length; i++){
            if(i == 0){
                menorNumero = vetor[i];
                indiceMenor = i;
            }
            if (vetor[i] < menorNumero){
                menorNumero = vetor[i];
                indiceMenor = i;
            }
        }


        System.out.println("Menor: " + menorNumero);
        System.out.println("Indice: " + indiceMenor);
    }
}
