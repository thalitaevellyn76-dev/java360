public class AlgoritmosDois {
    
    void main(){
        //ENTRADA DE DADOS

        IO.println("Seja bem vindo ao portal Java 360!");
        String usuario = IO.readln("Qual o seu nome?");
        IO.println("Ola, " + usuario + "! Bem Vindo ao portal!");
        
        //mais rapido sem metodos

        //int estrelas = 0;

        //mais lento com metodos (Classes Wrappers)

       //Integer.parseInt(valor para conversao) = 0;

        int estrelas = 0; 
        IO.println("Quem criou o Java?");
        IO.println("1 - James Goslin");
        IO.println("2 -  Bill Gates");
        IO.println("3 - Steve Jobs");
        IO.println("4 - Mark Zuckerberg");
        int resp = Integer.parseInt(IO.readln( "Digite o numero"));
        if(resp == 1){
            IO.println("Parabens, voce acertou!");
            estrelas = estrelas + 1;//variavel de incremento
            
            //estrelas++;

        } else {
            IO.println("voce errou!");

        }
        IO.println("Voce obteve " + estrelas +" estrelas.");
    }

}