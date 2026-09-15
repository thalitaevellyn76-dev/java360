import javax.swing.JOptionPane;

public class AlgoritmoVinteDois {
    public static void main(String[] args) {
        // Credenciais padrão
        final String USUARIO_CORRETO = "senai";
        final String SENHA_CORRETA = "123";

        int tentativas = 0;
        boolean autenticado = false;

        // Controle de acesso de login (máximo 3 tentativas)
        while (tentativas < 3 && !autenticado) {
            String usuarioInput = JOptionPane.showInputDialog(null, "Digite o usuário:", "Login SENATECH", JOptionPane.QUESTION_MESSAGE);
            String senhaInput = JOptionPane.showInputDialog(null, "Digite a senha:", "Login SENATECH", JOptionPane.QUESTION_MESSAGE);

            // Cancela o programa se o usuário fechar a janela
            if (usuarioInput == null || senhaInput == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (usuarioInput.equals(USUARIO_CORRETO) && senhaInput.equals(SENHA_CORRETA)) {
                autenticado = true;
            } else {
                tentativas++;
                if (tentativas < 3) {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos. Tentativa " + tentativas + " de 3.", "Erro de Autenticação", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        // Se errou 3 vezes, bloqueia
        if (!autenticado) {
            JOptionPane.showMessageDialog(null, "Cartão bloqueado! Por favor, procure o gerente.", "Acesso Bloqueado", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Etapa do empréstimo
        double valorEmprestimo = 0;
        while (true) {
            String strValor = JOptionPane.showInputDialog(null, "Quanto deseja simular de empréstimo? (Máximo: R$ 20.000)", "Simulação de Empréstimo", JOptionPane.QUESTION_MESSAGE);
            if (strValor == null) return;
            
            valorEmprestimo = Double.parseDouble(strValor);
            if (valorEmprestimo > 0 && valorEmprestimo <= 20000) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido! O valor máximo permitido é R$ 20.000,00.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        int parcelas = 0;
        while (true) {
            String strParcelas = JOptionPane.showInputDialog(null, "Em quantas parcelas deseja dividir? (Até 10 meses)", "Simulação de Empréstimo", JOptionPane.QUESTION_MESSAGE);
            if (strParcelas == null) return;

            parcelas = Integer.parseInt(strParcelas);
            if (parcelas >= 1 && parcelas <= 10) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Quantidade de parcelas inválida! Escolha entre 1 e 10 meses.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Cálculo do Empréstimo (Juros Simples de 1% ao mês)
        double taxaJuros = 0.01;
        double valorTotal = valorEmprestimo * (1 + (taxaJuros * parcelas));
        double valorParcela = valorTotal / parcelas;

        // Exibição dos Resultados
        String mensagemFinal = String.format(
            "Parabéns, seja bem vindo a família SENATECH.\n\n" +
            "• Valor Financiado: R$ %.2f\n" +
            "• Quantidade de Parcelas: %d x R$ %.2f\n" +
            "• Valor Total do Financiamento: R$ %.2f",
            valorEmprestimo, parcelas, valorParcela, valorTotal
        );

        JOptionPane.showMessageDialog(null, mensagemFinal, "Resumo da Simulação", JOptionPane.INFORMATION_MESSAGE);
    }
}