import java.util.Scanner;

public class Algoritmo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PREENCHIMENTO DE VARIÁVEIS SIMPLES ===");

        // 1. Leitura individual de cada variável
        System.out.print("Digite o 1º número: ");
        int numero1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o 2º número: ");
        int numero2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o 3º número: ");
        int numero3 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o 4º número: ");
        int numero4 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o 5º número: ");
        int numero5 = Integer.parseInt(scanner.nextLine());

        // 2. Exibição individual de cada variável
        System.out.println("\n=== VALORES GUARDADOS ===");
        System.out.println("Variável 1 = " + numero1);
        System.out.println("Variável 2 = " + numero2);
        System.out.println("Variável 3 = " + numero3);
        System.out.println("Variável 4 = " + numero4);
        System.out.println("Variável 5 = " + numero5);

        scanner.close();
    }
}