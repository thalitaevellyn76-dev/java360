package src;

public class Principal {
    void main() {
        // É uma instância de uma classe

        Algoritmo31 objeto = new Algoritmo31();
        /* classe obj at ope construtor */
        IO.println(objeto.getAloMundo());
        objeto.printarNaTela(); 
        
        Algoritmo32 objeto2 = new Algoritmo32();
        String nome = IO.readln("Digite seu nome: ");
        objeto2.mostrarSalaEco("Gabriel");
        objeto2.mostrarSalaEco(nome);

        Algoritmo32 objeto3 = new Algoritmo32();
        IO.println(objeto3.mostrarSala("Gabriel"));
    }
}
