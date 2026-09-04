import java.util.Scanner;

public class AlgoritmoNove {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- Cálculo da Terça Parte ---");
        System.out.print("Digite um número real: ");
        double numero = entrada.nextDouble();
        
        double tercaParte = numero / 3.0;
        
        System.out.println("A terça parte é: " + tercaParte);
        
        entrada.close();
    }
}