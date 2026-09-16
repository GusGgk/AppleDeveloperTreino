package Semana1.TercaFeira.exerciciosExtras;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você irá informar quantos anos meses e dias você tem, considerando do dia que você nasceu até hoje!");
        System.out.println("Informe quantos anos você viveu (apenas anos):");
        int ano = sc.nextInt();
        System.out.println("Informe agora quantos meses: ");
        int mes = sc.nextInt();
        System.out.println("Para finalizar agora os dias: ");
        int dia = sc.nextInt();

        int total_dia = (ano * 365) + (mes * 30) + dia;

        System.out.println("Você teve " + total_dia + " Dias vividos");
    }
}
