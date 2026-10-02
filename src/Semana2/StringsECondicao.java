package Semana2;
import java.util.Scanner;

public class StringsECondicao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String palavra = sc.next();

        String palavraInversa = "";

        for(int i = palavra.length() - 1; i >= 0; i--){
            palavraInversa += palavra.charAt(i);
        }

        if(palavra.equalsIgnoreCase(palavraInversa)){
            System.out.println("S");
        } else{
            System.out.println("N");
        }
    }

}
