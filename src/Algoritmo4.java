public class Algoritmo4 {

    public void main(){
        //estrutura de seleção simples
        int x = 10;

        if(x>=10){

            IO.println("número é maior ou igual a 10");
        }
        int y = 20;

        if(y==1)

            IO.println("número é igual a 1");
     
        else

        IO.println("número é diferente de 1");
        int z  = 5;

        if(z<10){

            IO.println("número é menor que 10");
        }
        else{

            IO.println("número é maior ou igual a 10");
        }

        // entre com um número inteiro e mostre se o número é positivo,negativo ou nulo

        int n = Integer.parseInt(IO.readln("Entre com um número"));

        if(n>0){

            IO.println("O número é positivo!");

        }else if(n<0){

            IO.println("O número é negativo!");
        }else{

            IO.println("O número é nulo!");
        }

        // operador ternário

        int a = 10;

        String resultado = (a>10) ? "maior que 10" : "menor ou igual a 10";

        IO.println(resultado);

        // estrutura de seleção múltipla

        int numAula = Integer.parseInt(IO.readln("Entre com um número de 1 a 4"));

        switch(numAula){

          case 1:
             IO.println("Segunda-feira");
             break; 
             
             //continue

          case 2:
            IO.println("Terça-feira");
             break;

          case 3:
            IO.println("Quarta-feira");
            break;

          case 4:
            IO.println("Quinta-feira");
            break;

          default:
            
            IO.println("Número inválido!");    
        }

    }  
   
}