package Semana2.Sexta0210;

import java.util.Scanner;

public class CondicionaisEAritmeticas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nProvas = 3;
        double[] respostas = new double[nProvas];
        double soma = 0;

        for (int i = 0; i < nProvas; i++){
            double resposta = sc.nextDouble();
            respostas[i] = resposta;
            soma += respostas[i];
        }
        double media = soma / nProvas;

        if(media >= 7.0){
            System.out.println("APROVADO");
        } else if(media >= 5.0 && media <= 6.9){
            System.out.println("RECUPERAÇÃO");
        } else{
            System.out.println("REPROVADO");
        }
    }
}
