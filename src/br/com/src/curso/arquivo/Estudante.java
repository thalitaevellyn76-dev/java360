package br.com.src.curso.arquivo;

public class Estudante {
    private String nome;
    private String curso;
    private int ano;

    

    public Estudante() {
    }



    public Estudante(String nome, String curso, int ano) {
        this.nome = nome;
        this.curso = curso;
        this.ano = ano;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getCurso() {
        return curso;
    }



    public void setCurso(String curso) {
        this.curso = curso;
    }



    public int getAno() {
        return ano;
    }



    public void setAno(int ano) {
        this.ano = ano;
    }
      
    @Override 
    public String toString() {
        return "nome" + nome + "| curso: " + curso  + " | Ano: " + ano;
    }
    
}
