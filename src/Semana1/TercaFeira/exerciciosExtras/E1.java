package Semana1.TercaFeira.exerciciosExtras;

public class E1 {
    public void alterar(){
        int a = 10;
        int b = 20;
        int aux = 0;

        System.out.println(a);
        System.out.println(b);

        aux = a;
        a = b;
        b = aux;

        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String args[]){
        E1 e = new E1();

        e.alterar();

    }

}
