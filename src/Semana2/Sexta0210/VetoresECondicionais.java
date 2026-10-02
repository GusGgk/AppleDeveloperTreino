package Semana2.Sexta0210;
import java.util.Scanner;

public class VetoresECondicionais {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] vetor = new int[n];
        int contadorPares = 0;
        int contadorImpares = 0;

        for(int i = 0; i < n; i++){
            vetor[i] = sc.nextInt();

            if(vetor[i] % 2 == 0){
                contadorPares++;
            } else{
                contadorImpares++;
            }
        }

        System.out.println("Pares: " + contadorPares);
        System.out.println("Impares: " + contadorImpares);
    }
}
