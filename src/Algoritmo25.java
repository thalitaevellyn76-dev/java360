import java.util.Scanner;

public class Algoritmo25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o vetor de 5 posições
        int[] numeros = new int[5];

        // Preenchendo o vetor com os números digitados pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Entre com o número: ");
            numeros[i] = Integer.parseInt(scanner.nextLine());
        }

        // Exibindo o dobro de cada número
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("O dobro da posição " + (i + 1) + " = " + (numeros[i] * 2));
        }

        scanner.close();
    }
}