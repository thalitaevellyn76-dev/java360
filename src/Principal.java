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
        
        Algoritmo33 alg33 = new Algoritmo33();
        alg33.inserirchave(3);
        IO.println(alg33.retornarChave());
        IO.println(alg33.abrirPorta());
    
        Algoritmo34 alg34 = new Algoritmo34();
        alg34.setPrimeiroNumero(10);
        alg34.setSegundoNumero(20);
        IO.println(alg34.getPrimeiroNumero());
        IO.println(alg34.getSegundoNumero());

        
        Algoritmo35 alg35 = new Algoritmo35();
        alg35.setModelo("");
        alg35.setPlaca("lis-2026");
        alg35.setCavalos(0);
        IO.println(alg35.getModelo());
        IO.println(alg35.getPlaca());
        IO.println(alg35.getCavalos());

    }
}