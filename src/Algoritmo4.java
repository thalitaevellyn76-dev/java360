package src;

public class Algoritmo4 {
    public static void main(){
        if(2<10){
            IO.print("número é menor que 10");
        }
        else {

             IO.println("número é maior ou igual a 10");
        }

            IO.println("número é maior ou igual a 10");

            
        //entre com o numero inteiro e mostre se o número é positivo, negativo ou nulo

        int n = Integer.parseInt(IO.readln("Entre com um numero"));

        if(n>0){

            IO.println("O número é positivo");
        }
        else if(n<0){

            IO.println("O número é negativo");
        }

        else{

            IO.println("O número é nulo!");
        }
        int a = 10;
        String resultado = (a>10) ? "maior que 10" : "menor ou igual a 10";
        IO.println(resultado);

        //estrutura de selecao multipla

        int numAula = Integer.parseInt(IO.readln("Entre com um numero de 1 a 4"));
        switch(numAula){

            case 1:
                IO.println("Segunda-feira");
                break; //continue

                case 2:
                IO.println("Terca-feira");
                break;

                case 3:
                IO.println("Quarta-feira");
                break;

                case 4:
                IO.println("Quinta-feira");
                break;

                default:
                    IO.println("Numero invalido!");

        }
}
}