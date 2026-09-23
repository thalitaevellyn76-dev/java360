import java.util.Scanner;
 
 public class Algoritmo10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Calculo da Media Aritmetica ---");
        System.out.println("Digite o priemiro numero real: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o primeiro numero real: ");
        double num2 = entrada.nextDouble();

        double media = (num1 + num2) / 2.0;

        System.out.println("media: " + media);

        entrada.close();



    }
    
}