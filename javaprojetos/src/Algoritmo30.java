import java.util.Scanner;

public class Algoritmo30 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite um numero para calcular o fatoria:");
            int numero = Integer.parseInt(scanner.nextLine());

                if (numero < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else if (numero == 0) {
            System.out.println("O fatorial de 0 é 1.");
        } else {
            // Vetor para armazenar o resultado de cada etapa
            long[] etapas = new long[numero];
            long acumulador = 1;

            //calculo do fatoral armazenando cada resultado parcial
            for (int i = 1; i <= numero; i++) {
                acumulador *= i;
                etapas[i - 1] = acumulador;
             }
             // exibicao das etapas (calculos parcias)
             System.out.println("\n=== ETAPAS DO CÁLCULO (CÁLCULOS PARCIAIS) ===");
              for(int I = 0; I < etapas.length; I++) {
                System.out.println("etapa" + (I + 1)+"(multiplicando por" + (I + 1)+"):" + etapas[I]);
              }

              //exibicao do resultado final
              System.out.println("\nResultado final do fatorial(" + numero + "!): " + etapas[etapas.length - 1]);
             }

             scanner.close();

}
}

