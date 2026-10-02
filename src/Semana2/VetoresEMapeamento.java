package Semana2;
import java.util.Scanner;

public class VetoresEMapeamento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int[] vetor = new int[n];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--){
            System.out.print(vetor[i]);
            if(i>0){
                System.out.print(" ");
            }
        }

    }
}
