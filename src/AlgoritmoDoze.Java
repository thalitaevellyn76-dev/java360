public class MaiorMenor {

    public static void main(String[] args) {
        // Entrada do primeiro número
        int num1 = Integer.parseInt(IO.readln("Digite o primeiro número: "));

        // Entrada do segundo número
        int num2 = Integer.parseInt(IO.readln("Digite o segundo número: "));

        // Estrutura condicional encadeada
        if (num1 > num2) {
            IO.println("O maior número é: " + num1);
            IO.println("O menor número é: " + num2);
        } else if (num2 > num1) {
            IO.println("O maior número é: " + num2);
            IO.println("O menor número é: " + num1);
        } else {
            IO.println("Os dois números são iguais (" + num1 + "). Não há maior ou menor.");
        }
    }

}