public class Algoritmo12 {
  
    public static void main(){

        int numero = Integer.parseInt(IO.readln("Digite um número: "));

        if(numero % 2 == 0){
            IO.println("O número é par");
        }
        else{
            IO.println("O número é ímpar");
        }
    }
}