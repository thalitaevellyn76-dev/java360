public class Algoritmo27 {
    public void main(){
        // definindo o vetor de 5 posições
        int[] numeros = new int[5];

        // preenchendo o vetor com os números digitados pelo usuário
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(IO.readln("entre com o número: "));
        }

        // exibindo os números na ordem inversa (do último ao primeiro)
        for(int i = numeros.length - 1; i >= 0; i--){
            IO.println("Posição " + (i+1) + " = " + numeros[i]);
        }

    }
}