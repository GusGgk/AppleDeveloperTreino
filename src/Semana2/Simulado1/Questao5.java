package Semana2.Simulado1;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();


        String vogais = "aeiouAEIOU";
        String resultado1 = "";
        String resultado2 = "";

        for(int i = 0; i < palavra.length(); i++){
            char caracter = palavra.charAt(i);
            if(vogais.contains(String.valueOf(caracter))){
                resultado1 += caracter;
            } else {
                resultado2 += caracter;
            }

        }
        resultado2 = resultado2.replace(" ", "");
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
