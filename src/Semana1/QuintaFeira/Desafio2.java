package Semana1.QuintaFeira;

public class Desafio2 {
    public int contarDivisoresValidos(int n){
        String texto = String.valueOf(n);
        int contador = 0;
        for (int i = 0; i < texto.length(); i++){
            int digito = texto.charAt(i) - '0';
            if(digito == 0){
                continue;
            }
            if(n % digito == 0){
                contador++;
            }

        }
        return contador;
    }
}
