package Semana1.QuartaFeira;

public class Desafio1 {
    /*
    * Crie um programa que receba um texto e
    * conte quantas vogais (a, e, i, o, u)
    * existem nele usando um laço while
    * */
    public int contagemVogais(String palavra){
        int contador = 0;
        int i = 0;
        String vogais = "aeiouAEIOU";
        while( i < palavra.length()){
            char letraAtual = palavra.charAt(i);

            if(vogais.contains(String.valueOf(letraAtual))){
                contador++;
            }
            i++;
        }
        return contador;
    }

    public static void main(String args[]){
        Desafio1 desafio1 = new Desafio1();
        System.out.println(desafio1.contagemVogais("amor"));
    }
}
