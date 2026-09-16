package Semana1.TercaFeira;

public class LeetCode3783 {
    public int mirrorDistance(int n) {
        int original = n;
        int invertido = 0;

        while(n > 0){
            int ultimoDigito = n % 10;
            invertido = (invertido * 10) + ultimoDigito;
            n = n /10;
        }

        int diferenca = original - invertido;

        if(diferenca < 0){
            diferenca = -diferenca;
        }
        return diferenca;
    }
}
