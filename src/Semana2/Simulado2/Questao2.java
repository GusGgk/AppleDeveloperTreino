package Semana2.Simulado2;
import java.util.Scanner;


public class Questao2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if (a.length() == b.length() && a.charAt(0) == b.charAt(0)){
            System.out.println("S");
        } else{
            System.out.println("N");
        }
    }
}
