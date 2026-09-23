public class Algoritmo26 {
    public void main(){
        // definindo o vetor de 5 posições
        int[] numeros = new int[5];
        int soma = 0;

        // preenchendo o vetor com os números digitados pelo usuário
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(IO.readln("entre com o número: "));
        }

        // calculando a soma dos elementos do vetor
        for(int i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];
        }

        // exibindo o resultado da soma
        IO.println("A soma de todos os números é = " + soma);

    }
}