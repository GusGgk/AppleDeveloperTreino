package Semana1.SegundaFeira;

public class Desafio5 {

    public int[] viraBinario(int[] nums){
        for (int i = 0; i < nums.length ;i++){

            if(nums[i] % 2 == 0){
                nums[i] = 0;
            } else{
                nums[i] = 1;
            }
        }
        return nums;
    }

    public static void main(String args[]){
        Desafio5 desafio5 = new Desafio5();

        int[] resultado = desafio5.viraBinario(new int[]{4,7,2,9,10});

        System.out.println(java.util.Arrays.toString(resultado));

    }
}
