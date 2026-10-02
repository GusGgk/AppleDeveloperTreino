package Semana2.Sexta0210;

import java.util.Scanner;

public class StringsERepeticao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        String vogais = "aeiouAEIOU";
        String resultado = "";

        for(int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);

            if(vogais.contains((String.valueOf(c)))){
                resultado += "*";
            } else {
                resultado += c;
            }
        }
        System.out.println(resultado);


    }
}
