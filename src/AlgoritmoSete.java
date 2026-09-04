import java.util.Scanner;

public class AlgoritmoSete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- Calculadora de Soma ---");
        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();
        
        int soma = num1 + num2;
        
        System.out.println("Soma: " + soma);
        
        entrada.close();
    }
}