public class Principal {
    void main() {
        Algoritmo31 objeto = new Algoritmo31();

        IO.print(objeto.getAloMundo());
        objeto.printarNaTela();

        Algoritmo32 objeto2 = new Algoritmo32();
        String nome = IO.readln("Digite o seu nome:");
        objeto2.mostrarSalaEco("Thalita");
        objeto2.mostrarSalaEco("Sophia");

        Algoritmo32 objeto3 = new Algoritmo32();
        IO.print(objeto3.mostrarSala("Thalita"));

    }
    
}