import java.util.Scanner;

public class AlgoritmoSeis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- Cadastro de Contato do Projeto ---");
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite o endereço: ");
        String endereco = entrada.nextLine();
        
        System.out.print("Digite o telefone: ");
        String telefone = entrada.nextLine();
        
        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        
        entrada.close();
    }
}