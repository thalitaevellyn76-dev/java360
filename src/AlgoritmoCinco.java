import java.util.Scanner;

public class AlgoritmoCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- Assistente de Canais da Dona Luciene ---");
        System.out.print("Digite o número do canal atual: ");
        int canal = entrada.nextInt();
        
        int anterior = canal - 1;
        int proximo = canal + 1;
        
        System.out.println("Para voltar, coloque no canal: " + anterior);
        System.out.println("Para avançar, coloque no canal: " + proximo);
        
        entrada.close();
    }
}