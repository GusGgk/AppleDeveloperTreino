package Semana1.QuartaFeira;

public class LeetCode1812 {
    public boolean squareIsWhite(String coordinates) {
        String colunas = "abcdefgh";

        int coluna = colunas.indexOf(coordinates.charAt(0)) + 1;

        int linha = Character.getNumericValue(coordinates.charAt(1));

        return (coluna + linha) % 2 != 0;

    }
}
