package Semana1.TercaFeira;

public class LeetCode2413 {
    public int smallestEvenMultiple(int n) {
        int mmc = 0;
        if (n % 2 == 0){
            mmc = n;
        } else{
            mmc = n * 2;
        }
        return mmc;
    }
}
