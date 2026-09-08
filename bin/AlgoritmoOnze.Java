public class AlgoritmoOnze {

    public void main() {

        // Leitura do nome informado pelo usuário usando a biblioteca IO

        String nome = IO.readln("Entre com o seu nome: ");

        // Verificação sem chaves no bloco if

        if (nome.equalsIgnoreCase("Thalita"))
            IO.println("Nome correto! Acesso liberado, Thalita.");
        else
            IO.println("Nome incorreto! Acesso negado.");
    }
    
}