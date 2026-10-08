package br.com.src.curso.poo;

public class Algoritmo37 {
    public static void main(String[] args) {
        /*
        Exemplo Didático
         - Herança
         - super()
         - Redefinição do Construtor
         - Polimorfismo
         - Sobrescrita (override)
         - Sobrecarga (overload)
        */

        AnimalCachorro c = new AnimalCachorro("Max", "Latido", "Ração");
        AnimalGato g = new AnimalGato("Tom", "Miau", "Ração");
        AnimalPorco p = new AnimalPorco("JAVA", "Grunhido", "Ração");

        IO.println("O nome do cachorro é: " + c.getNome());
        c.arquivoSom();
        c.comer();

        IO.println("O nome do gato é: " + g.getNome());
        g.arquivoSom();
        g.comer();

        IO.println("O nome do porco é: " + p.getNome());
        p.arquivoSom();
        p.comer();
    }
}