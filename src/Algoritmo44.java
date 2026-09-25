public class Algoritmo44 {
    public static void main(String[] args) {

        int[][] matriz = {
            {20, 50, 80},
            {45, 60, 90},
            {45, 67, 89}
        };

        IO.println("Diagonal principal:");

        for (int i = 0; i < 3; i++) {
            IO.println(matriz[i][i]);
        }
    }
}