package Semana2;

/* package whatever; // don't place package name! */
import java.util.Scanner;
import java.io.*;

class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de vezes que você quer que a palavra se repita");
        int n = sc.nextInt();

        sc.nextLine();
        if(n > 0 && n <= 100){
            System.out.println("Informe qual será a palavra");
            String palavra = sc.next();
            for(int i = 0; i < n; i++){
                System.out.println(palavra);
            }
        }

    }
}

