package Semana1.TercaFeira;

public class LeetCode2520 {
    public int countDigits(int num){
        String texto = String.valueOf(num);
        int contador = 0;
        for(int i = 0; i < texto.length(); i++){
            int atual = texto.charAt(i) - '0'; // usa esse - '0' por causa do ASCII
              if(num % atual == 0){
                  contador++;
              }
        }
        return contador;
    }

    public static void main(String args[]){
        LeetCode2520 leetCode2520 = new LeetCode2520();

        System.out.println(leetCode2520.countDigits(121));

    }
}
