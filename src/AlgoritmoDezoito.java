public class AlgoritmoDezoito {
    public static void main(String[] args) {
       
        int[] numeros = new int[101];

       
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 2;
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}