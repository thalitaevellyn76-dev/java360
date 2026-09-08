public class AlgoritmoDoze {

    public void main() {

        // Leitura e conversão do número inteiro

        int numero = Integer.parseInt(IO.readln("Entre com um número inteiro: "));

        // O resto da divisão por 2 (% 2) de qualquer número par é sempre igual a 0
        
        if (numero % 2 == 0)
            IO.println("O número " + numero + " é PAR!");
        else
            IO.println("O número " + numero + " é ÍMPAR!");
    }

}