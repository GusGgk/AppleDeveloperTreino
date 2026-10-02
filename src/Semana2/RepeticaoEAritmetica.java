package Semana2;

import java.util.Scanner;

public class RepeticaoEAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] listaNumeros = new int[n];
        for (int i = 0; i < n;i++){
           listaNumeros[i] =  sc.nextInt();
        }

        int contador = 0;
        double soma = 0;
        for (int i = 0; i < listaNumeros.length; i++){
            if (listaNumeros[i] % 2 == 0){
                contador++;
                soma += listaNumeros[i];
            }
        }
        double media = soma / contador;
        System.out.println(media);
    }
}
