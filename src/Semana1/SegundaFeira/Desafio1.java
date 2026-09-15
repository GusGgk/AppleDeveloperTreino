package Semana1.SegundaFeira;

// Criar um objeto Scanner para ler dados, pedir ao usuário duas notas
// e o total de faltas
//calcula a media das duas notas
// cria a variavel de aprovado para caso o aluno tire a nota acima de 7 e faltas menor que 10
// exibir a media e se o aluno foi aprovado


import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        int faltas = 0;

        System.out.println("Qual a nota da sua primeira prova?");
        double n1 = sc.nextDouble();

        System.out.println("Qual a nota da sua segunda prova?");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.println("Qual a quantidade de faltas que você tem?");
        faltas = sc.nextInt();

        boolean aprovado = (media >= 7.0) && (faltas < 10);

        System.out.println("Média: " + media);
        System.out.println("Aprovado: " + aprovado);
    }
}
