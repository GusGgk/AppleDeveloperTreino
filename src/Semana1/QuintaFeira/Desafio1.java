package Semana1.QuintaFeira;

public class Desafio1 {
    public static double formatarEConverter(String texto){
        texto = texto.replace(",", ".");
        double numero = Double.parseDouble(texto);

        double nFahrenheit = numero * 1.8 + 32;

        return nFahrenheit;
    }

    public static void main(String args[]){
        Desafio1 desafio1 = new Desafio1();

        double resultado = formatarEConverter("25,5");

        System.out.println("Temperatura em Fahrenheit: " + resultado);

    }
}
