package Semana1.SegundaFeira;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o nome do aluno?");
        String nome = sc.nextLine();

        //caso o int vem antes precisamos ter um sc.nextLine() fantasma para n quebrar

        System.out.println("Qual a idade?");
        int idade = sc.nextInt();

        String statusIdade;

        if(idade >= 18){

            statusIdade = "Maior de idade";
        }else{
            statusIdade = "Menor de idade";
        }

        System.out.println(statusIdade);

    }
}
