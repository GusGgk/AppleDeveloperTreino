package Semana1.TercaFeira;

public class ExercicioAquecimento2 {

    public double calcularFrete(double valorCompra, boolean ehVIP, boolean entregaExpressa) {
        // Operador Ternário: (condicao) ? valorSeVerdadeiro : valorSeFalso
        double freteBase = (ehVIP || valorCompra > 200.0) ? 0.0 : 20.0;

        // Se for entrega expressa, soma +15
        if (entregaExpressa) {
            freteBase += 15.0;
        }

        return freteBase; // Retorna apenas o valor do frete
    }

    public static void main(String[] args) {
        ExercicioAquecimento2 ex = new ExercicioAquecimento2();

        System.out.println(ex.calcularFrete(150, false, true)); // Frete 20 + 15 = 35.0
        System.out.println(ex.calcularFrete(250, false, false)); // VIP/Compra Alta -> Frete 0.0
    }
}