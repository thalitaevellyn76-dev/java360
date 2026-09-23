import java.util.Scanner;

public class Algoritmo6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cadastro de Alunos");

        System.out.println("Digite o nome do aluno:");
        String nome = entrada.nextLine();

        System.out.println("Digite o endereço do aluno:");
        String endereco = entrada.nextLine();

        System.out.println("Digite o telefone do aluno:");
        String telefone = entrada.nextLine();

        System.out.println("\nCadastro realizado com sucesso!");

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);

        entrada.close();
    }
}
