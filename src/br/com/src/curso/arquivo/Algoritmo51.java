package br.com.src.curso.arquivo;
import javax.swing.JOptionPane;//importou o swing

public class Algoritmo51 {

    void main(){

        //Criar calculadora
        //Que só tem a operação de divisão
        //Tratar uma exceção de um número dividido por zero
        //Use ia 
        // Log (console)
        IO.println("*** CALCULADORA DE DIVISÃO ***");

        double numero1;//variável
        double numero2; //variável
        String titulo = "*** CALCULADORA DE DIVISÃO ***"; //título
        int janelaAtencao = JOptionPane.INFORMATION_MESSAGE; //tipo de jan

        

        try{
            numero1 = Double.parseDouble(JOptionPane.showInputDialog(
                         null,"Digite o primeiro número:", titulo, janelaAtencao));
            numero2 = Double.parseDouble(JOptionPane.showInputDialog(
                         null,"Digite o segundo número:", titulo, janelaAtencao));

                if(numero2 == 0){
                
                    throw new IllegalArgumentException("Não é possível dividir por zero!");

                }

            double resultado = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "Resultado da divisão:\n" + resultado, titulo, janelaAtencao);
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                                  "Você só pode digitar números! Tente novamente.", titulo, janelaAtencao);            
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), titulo, janelaAtencao);            
        }finally{
            JOptionPane.showMessageDialog(null,"Fim da operação.", titulo, janelaAtencao);
        }       
    }
}