package br.com.src.curso.arquivo;
import java.util.HashMap;
import java.util.Map;

// 1. Definimos o modelo de dados usando Record (código limpo e imutável)
record Aluno(String nome, String curso, int anoIngresso) {}

public class Algoritmo53 {
    public static void main(String[] args) {
        
        // 2. Criamos o nosso "Dicionário" (Map)
        // Chave: String (Número da Matrícula) | Valor: Aluno (Objeto com os dados)
        Map<String, Aluno> dicionarioAlunos = new HashMap<>();

        // 3. Cadastrando alunos no mapa (Operação de escrita)
        dicionarioAlunos.put("MAT-2026-001", new Aluno("Ana Silva", "Engenharia de Software", 2026));
        dicionarioAlunos.put("MAT-2026-002", new Aluno("Bruno Souza", "Ciência da Computação", 2026));
        dicionarioAlunos.put("MAT-2025-089", new Aluno("Carla Dias", "Sistemas de Informação", 2025));

        // 4. Buscando um aluno pela matrícula (Operação de leitura rápida O(1))
        String matriculaBusca = "MAT-2026-001";
        Aluno alunoEncontrado = dicionarioAlunos.get(matriculaBusca);

        System.out.println("--- BUSCA DE MATRÍCULA ---");
        if (alunoEncontrado != null) {
            System.out.println("Matrícula " + matriculaBusca + " pertence a: " + alunoEncontrado.nome());
            System.out.println("Curso: " + alunoEncontrado.curso());
        } else {
            System.out.println("Matrícula não encontrada.");
        }

        // 5. Iterando (percorrendo) o dicionário completo de forma moderna
        System.out.println("\n--- LISTA COMPLETA DE ALUNOS MATRICULADOS ---");
        dicionarioAlunos.forEach((matricula, aluno) -> {
            System.out.println("Matrícula: " + matricula + " | Nome: " + aluno.nome() + " (" + aluno.curso() + ")");
        });
        
        // 6. Removendo um aluno do sistema
        dicionarioAlunos.remove("MAT-2025-089");
    }
}