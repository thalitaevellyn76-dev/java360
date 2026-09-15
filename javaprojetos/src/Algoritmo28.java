public class Algoritmo28 {
    public void main(){
        // definindo o vetor de 5 posições
        int[] numeros = new int[5];

        // preenchendo o vetor com os números digitados pelo usuário
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(IO.readln("entre com o número: "));
        }

        // exibindo apenas os números pares
        IO.println("=== NÚMEROS PARES ENCONTRADOS ===");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                IO.println("Posição " + (i+1) + " = " + numeros[i]);
            }
        }

    }
}