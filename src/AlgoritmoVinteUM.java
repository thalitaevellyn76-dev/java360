public class AlgoritmoVinteUM {
    public static void main(String[] args) {
        int[] numeros = {45 , 67 , 89 , 34 , 23 , 56 , 78 , 45 ,98 , 34 };

        double soma = 0;
        
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        
        double media = soma / numeros.length;

        System.out.println("Soma total: " + (int) soma);
        System.out.println("Soma total: " + media );
    }
    
}