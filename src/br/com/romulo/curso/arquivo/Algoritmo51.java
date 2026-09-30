package br.com.romulo.curso.arquivo;
public class Algoritmo51 {

    public static void main(String[] args) {
        // criar uma calculadora
        // que so tem a operacao de divisao

        // tratar uma excecao de
        // um numero dividido por zero
        // Use o robozinho...

        //try
          //entre com numero
          //entre com o divisor
          //calculo
        //catch

        //catch

        //finaly

        try {
            IO.println("Entre com o numero:");
            int numero = Integer.parseInt(IO.readln());

            IO.println("Entre com o divisor:");
            int divisor = Integer.parseInt(IO.readln());

            int calculo = numero / divisor;
            IO.println("Resultado da divisão: " + calculo);

        } catch (ArithmeticException e) {
            IO.println("Erro: Não é possível dividir por zero!");
        } catch (NumberFormatException e) {
            IO.println("Erro: Por favor, digite apenas números inteiros válidos!");
        } finally {
            IO.println("Operação finalizada.");
        }
    }
}