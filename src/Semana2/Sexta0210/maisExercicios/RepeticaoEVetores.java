package Semana2.Sexta0210.maisExercicios;

import java.util.Scanner;

public class RepeticaoEVetores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }

        for( int i : c){
            System.out.print(i + " ");
        }

    }
}
