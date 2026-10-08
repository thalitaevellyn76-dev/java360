package br.com.src.curso.arquivo;
public class Algoritmo50 {
     
    void main(){

        try{
            int idade = Integer.parseInt( 
            IO.readln("Qual a sua idade"));
            String resultado = (idade >= 18) ? "maior" : "Menor";
           IO.print(resultado);
        }catch(NumberFormatException e){
            //erro
            //e.getMessage() - quanto estiver na web use print () console()
            IO.println("valor invalido.digite um numero");
        }finally{
            //conclusao (independe se deu certo ou errado)
            //Janelinha windows (do lado 'fn') "."
            IO.println("😎- Encerrado SystemSys");
        }
    }
    
}
