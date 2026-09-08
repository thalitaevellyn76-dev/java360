public class AlgoritmoQuartoze {

    public void main() {

        // Entrada de opção do menu

        int opcao = Integer.parseInt(IO.readln("--- MENU DO JOGO ---\n1. Iniciar\n2. Status de Vida\n3. Sair\nDigite uma opção: "));

        // Estrutura de seleção múltipla (switch)
        
        switch (opcao) {
            case 1:
                IO.println("Jogo iniciado");
                break;
            case 2:
                IO.println("Suas vidas estão acabando");
                break;
            case 3:
                IO.println("Game Over!");
                break;
            default:
                IO.println("Número inválido");
                break;
        }
    }

}