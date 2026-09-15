import java.util.Scanner;

public class Algoritmo30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else if (numero == 0) {
            System.out.println("O fatorial de 0 é 1.");
        } else {
            // Vetor para armazenar o resultado de cada etapa
            long[] etapas = new long[numero];
            long acumulador = 1;

            // Cálculo do fatorial armazenando cada resultado parcial
            for (int i = 1; i <= numero; i++) {
                acumulador *= i;
                etapas[i - 1] = acumulador;
            }

            // Exibição das etapas (cálculos parciais)
            System.out.println("\n=== ETAPAS DO CÁLCULO (CÁLCULOS PARCIAIS) ===");
            for (int i = 0; i < etapas.length; i++) {
                System.out.println("Etapa " + (i + 1) + " (multiplicando por " + (i + 1) + "): " + etapas[i]);
            }

            // Exibição do resultado final
            System.out.println("\nResultado final do fatorial (" + numero + "!): " + etapas[etapas.length - 1]);
        }

        scanner.close();
    }
}