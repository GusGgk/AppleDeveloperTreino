package Semana1.SegundaFeira;

public class LeetCode1295 {
    public int listaN(int[] nums){
        int quantidadePares = 0;


        for(int i = 0; i < nums.length; i++){
            String texto = String.valueOf(nums[i]); // transformamos cada i em texto para contar
            int quantidadeDeDigitos = texto.length(); // aqui de fato contamos seus digitos e transformamos em int

            if(quantidadeDeDigitos % 2 == 0){ // verifica se é par
                quantidadePares++;
            }
        }
        return quantidadePares;
    }
    public static void main(String args[]){
        LeetCode1295 leetCode1295 = new LeetCode1295();

        int resultado = leetCode1295.listaN(new int[]{12,345,2,6,7896});
        System.out.println("Quantidade de numeros com digitos pares: " + resultado);
    }
}
