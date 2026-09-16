package src;
public class Algoritmo2 {
    
    void main(){
        //ENTRADA DE DADOS

        IO.println("Seja bem vindo ao portal java 360");
        String usuario = IO.readln("Qual o seu nome?");
        IO.println("Ola," + usuario + "Bem vindo ao portal");
         //mais rapido sem metodos
         // mais lento com métodos 

         //mais lento com métodos(Classe Wrappers)
        int estrelas = 0; 
        IO.println("Quem criou o java?");
        IO.println("1 - James Gosling");
        IO.println("2 - Bill Gates");
        IO.println("3 - Steve Jobs");
        IO.println("4 - Mark Zuckerberg");
        int resp = Integer.parseInt(IO.readln("Digite o número"));
        if (resp ==1) {
            IO.println("Parabé, voce acertou!");
            estrelas = estrelas + 1;//variá de incremento
            //estrelas++;
        }else{
            IO.println("Você errou!");
        }
            IO.println("Você obteve" + estrelas +" estrelas.");

        
    }
    
}