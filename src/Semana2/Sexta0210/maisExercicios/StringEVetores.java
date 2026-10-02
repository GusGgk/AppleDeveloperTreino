package Semana2.Sexta0210.maisExercicios;

import java.util.Scanner;

public class StringEVetores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int contador = 0;

        for (int i = 0; i < n; i++){
            String palavra = sc.next();
            if(palavra.length() >= 5){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
