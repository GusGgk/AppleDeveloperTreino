package Semana1.TercaFeira;

public class LeetCode2011 {
    public int finalValueAfterOperations(String[] operations){
        int valor = 0;
        for(int i = 0; i < operations.length;i++){
            if(operations[i].contains("+")){
                valor++;
            } else{
                valor--;
            }
        }
        return valor;
    }
}
