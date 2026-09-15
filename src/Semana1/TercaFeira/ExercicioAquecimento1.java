package Semana1.TercaFeira;

public class ExercicioAquecimento1 {

    public boolean ehBissexto(int ano){
        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            boolean bissexto = true;
            return bissexto;
        } else{
            boolean anoNormal = false;
            return anoNormal;
        }
    }

    public static void main(String args[]){
        ExercicioAquecimento1 aquecimento1 = new ExercicioAquecimento1();

        boolean resultado = aquecimento1.ehBissexto(2024); // true
        boolean resultado1 = aquecimento1.ehBissexto(2025);
        System.out.println(resultado);
        System.out.println(resultado1);

    }
}
