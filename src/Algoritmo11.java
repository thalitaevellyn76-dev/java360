package src;

public class Algoritmo11 {
    public static void main(){
        String nome = IO.readln("digite seu nome: ");
        
        if(nome.equalsIgnoreCase("gabriel"))
            {
            IO.println("olá, seja bem vindo:" + nome);
        }
        else {
             IO.println("VOCé NÃO É O GABRIEL, ENTÃO NÃO TEM PERMISSÃO PARA ENTRAR");
        }

            IO.println("*********fim do programa***************");
    }
}
   