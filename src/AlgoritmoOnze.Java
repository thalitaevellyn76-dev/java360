import java.util.Scanner;

public class VerificaNome {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        // Estrutura condicional sem chaves
        if (nome.equalsIgnoreCase("Thalita"))
            System.out.println("Acesso liberado: O nome digitado realmente é Thalita!");
        else
            System.out.println("Acesso negado: O nome digitado não é o esperado.");

        entrada.close();
    }
}