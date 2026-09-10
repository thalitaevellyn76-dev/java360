public class Algoritmo26{
    public void main() {
        // Definindo o vetor de 5 posições
        int[] numeros = new int[5];

        // Preenchendo o vetor com os números digitados pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("Entre com o número: "));
        }

        // Exibindo o dobro de cada número
        for (int i = 0; i < numeros.length; i++) {
            IO.println("O dobro da posição " + (i + 1) + " = " + (numeros[i] * 2));
        }
    }
}