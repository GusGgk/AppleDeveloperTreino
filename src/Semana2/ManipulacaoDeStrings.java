package Semana2;
import java.util.Scanner;

public class ManipulacaoDeStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        char letraDesejada = sc.next().charAt(0);

        int contador = 0;

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == letraDesejada){
                contador++;
            }
        }
        System.out.println(contador);

    }
}
