package br.com.romulo.curso.arquivo;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Algoritmo55 {

    private static final String CAMINHO_ARQUIVO = "ambientes.txt";
    private static final Map<String, String> ambientes = new HashMap<>();
    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {
        // Carrega dados preexistentes do arquivo para o HashMap ao iniciar
        carregarDoArquivo();

        // Inicializa com as chaves de exemplo se o arquivo estiver vazio
        if (ambientes.isEmpty()) {
            ambientes.put("F07", "Laboratório de Programação Java");
            ambientes.put("B03", "Sala de Aula Padrão");
            ambientes.put("G09", "Oficina de Laternagem e Pintura");
            salvarNoArquivo();
        }

        int opcao = 0;

        // Loop principal do sistema
        do {
            String menu = """
                    --- SISTEMA DE CADASTRO DE AMBIENTES ---
                    1. Cadastrar
                    2. Listar
                    3. Pesquisar
                    4. Alterar
                    5. Excluir
                    6. Sair
                    
                    Escolha uma opção:
                    """;

            String entrada = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            if (entrada == null) {
                // Se o usuário clicar em "Cancelar" ou fechar a janela
                opcao = 6;
            } else {
                try {
                    opcao = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, digite um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
            }

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> listar();
                case 3 -> pesquisar();
                case 4 -> alterar();
                case 5 -> excluir();
                case 6 -> JOptionPane.showMessageDialog(null, "Saindo do sistema... Até logo!", "Sair", JOptionPane.INFORMATION_MESSAGE);
                default -> JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }

        } while (opcao != 6);
    }

    // CRUD: Cadastrar
    private static void cadastrar() {
        String chave = JOptionPane.showInputDialog("Digite o código do ambiente (ex: F07):");
        if (chave == null || chave.trim().isEmpty()) return;

        chave = chave.trim().toUpperCase();

        if (ambientes.containsKey(chave)) {
            JOptionPane.showMessageDialog(null, "Chave já cadastrada! Use a opção de alterar.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String descricao = JOptionPane.showInputDialog("Digite a descrição do ambiente:");
        if (descricao == null || descricao.trim().isEmpty()) return;

        ambientes.put(chave, descricao.trim());
        salvarNoArquivo();
        
        String logData = LocalDateTime.now().format(FORMATADOR_DATA);
        JOptionPane.showMessageDialog(null, "Ambiente cadastrado com sucesso!\nRegistro em: " + logData);
    }

    // CRUD: Listar
    private static void listar() {
        if (ambientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum ambiente cadastrado.", "Lista de Ambientes", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder builder = new StringBuilder("--- AMBIENTES CADASTRADOS ---\n");
        for (Map.Entry<String, String> entry : ambientes.entrySet()) {
            builder.append("Código: ").append(entry.getKey())
                   .append(" | Descrição: ").append(entry.getValue())
                   .append("\n");
        }

        JOptionPane.showMessageDialog(null, builder.toString(), "Lista de Ambientes", JOptionPane.INFORMATION_MESSAGE);
    }

    // CRUD: Pesquisar
    private static void pesquisar() {
        String chave = JOptionPane.showInputDialog("Digite o código do ambiente para pesquisar:");
        if (chave == null || chave.trim().isEmpty()) return;

        chave = chave.trim().toUpperCase();

        if (ambientes.containsKey(chave)) {
            JOptionPane.showMessageDialog(null, "Código: " + chave + "\nDescrição: " + ambientes.get(chave), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Ambiente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // CRUD: Alterar
    private static void alterar() {
        String chave = JOptionPane.showInputDialog("Digite o código do ambiente que deseja alterar:");
        if (chave == null || chave.trim().isEmpty()) return;

        chave = chave.trim().toUpperCase();

        if (!ambientes.containsKey(chave)) {
            JOptionPane.showMessageDialog(null, "Ambiente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String novaDescricao = JOptionPane.showInputDialog("Descrição atual: " + ambientes.get(chave) + "\nDigite a NOVA descrição:");
        if (novaDescricao == null || novaDescricao.trim().isEmpty()) return;

        ambientes.put(chave, novaDescricao.trim());
        salvarNoArquivo();
        
        String logData = LocalDateTime.now().format(FORMATADOR_DATA);
        JOptionPane.showMessageDialog(null, "Ambiente alterado com sucesso!\nAtualizado em: " + logData);
    }

    // CRUD: Excluir
    private static void excluir() {
        String chave = JOptionPane.showInputDialog("Digite o código do ambiente que deseja excluir:");
        if (chave == null || chave.trim().isEmpty()) return;

        chave = chave.trim().toUpperCase();

        if (ambientes.containsKey(chave)) {
            ambientes.remove(chave);
            salvarNoArquivo();
            JOptionPane.showMessageDialog(null, "Ambiente removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Ambiente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Persistência: FileWriter com Try-Catch-Finally
    private static void salvarNoArquivo() {
        FileWriter writer = null;
        try {
            writer = new FileWriter(CAMINHO_ARQUIVO);
            for (Map.Entry<String, String> entry : ambientes.entrySet()) {
                writer.write(entry.getKey() + ";" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no arquivo: " + e.getMessage(), "Erro de E/S", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Erro ao fechar o FileWriter: " + e.getMessage());
            }
        }
    }

    // Leitura do arquivo ao iniciar
    private static void carregarDoArquivo() {
        File arquivo = new File(CAMINHO_ARQUIVO);
        if (!arquivo.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    ambientes.put(partes[0], partes[1]);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados do arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}