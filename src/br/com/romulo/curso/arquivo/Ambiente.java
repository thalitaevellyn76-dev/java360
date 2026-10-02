package br.com.romulo.curso.arquivo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ambiente {
    private String chave;
    private String descricao;
    private LocalDateTime dataRegistro;

    // Construtor
    public Ambiente(String chave, String descricao) {
        this.chave = chave;
        this.descricao = descricao;
        this.dataRegistro = LocalDateTime.now(); // Grava a data e hora atual
    }

    // Construtor sobrecarregado (útil caso leia do arquivo)
    public Ambiente(String chave, String descricao, LocalDateTime dataRegistro) {
        this.chave = chave;
        this.descricao = descricao;
        this.dataRegistro = dataRegistro;
    }

    // Getters e Setters
    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    // Formatação de data/hora
    public String getDataFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataRegistro.format(formatter);
    }

    // Método toString()
    @Override
    public String toString() {
        return "Chave: " + chave + 
               " | Descrição: " + descricao + 
               " | Cadastrado em: " + getDataFormatada();
    }
}