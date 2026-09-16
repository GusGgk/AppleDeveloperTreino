package Semana1.TercaFeira;

import java.util.Arrays;

public class LeetCode3760 {
    public int maxDistinct(String s) {
        int contador = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(s.indexOf(c) == i){
                contador++;
            }
        }
        return contador;
    }

    public static void main(String args[]){
        LeetCode3760 leetCode3760 = new LeetCode3760();

        int resultado = leetCode3760.maxDistinct("abab");
        System.out.println(resultado);
    }
}
