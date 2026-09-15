public class Algoritmo24 {
    public void main() {
        // Definindo o vetor de 5 posições
        int[] numeros = new int[5];

        // Preenchendo o vetor com os números digitados pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("Entre com o número " + (i + 1) + ": "));
        }

        // Exibindo os números digitados pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            IO.println("Variável " + (i + 1) + " = " + numeros[i]);
        }
    }
}