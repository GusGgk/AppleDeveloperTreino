package Semana2.Simulado2;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int [] vetor = new int[n];


        for(int i = 0; i < n; i++){
            vetor[i] = sc.nextInt();
        }

        for(int i = n - 1; i >= 0; i--){
            if(vetor[i] > 0){
                System.out.print(vetor[i] + " ");
            }
        }




    }
}
