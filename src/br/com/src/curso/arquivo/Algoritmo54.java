//Toda classe começa com letra Maíscula
// pacote - package (separar as coisas por assunto)
package br.com.src.curso.arquivo;

//criar a classe Algoritmo54.java
public class Algoritmo54 {

    //método main - ponto de entrada do programa
    void main(){
        //Silogismo
        //Premissa 1 - Todos os homens são mortais
        //Premissa 2 - Sócrates é homem
        //Conclusão - Sócrates é mortal
        //Exemplo de silogismo - número par
        int n = 8;//premissa 1 - número par é divisível por 2
        if (n % 2 == 0) { //premissa 2 - se o resto da divisão por 2 é igual a 0
            IO.println("O número " + n + " é par.");//conclusão - o número é par
        } else {
            IO.println("O número " + n + " é ímpar.");//conclusão - o número é ímpar
        }
    }


}