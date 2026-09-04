public class AlgoritmoTres {
    
    void main(){

        //numeros inteiros de 0 a 100

        int nota1,nota2,nota3;

        //media e real (double)
        
        double media;

        // operadores: + , -, *, /, %

        // ENTRADA  das Notas dos Alunos

         nota1 = Integer.parseInt(IO.readln("digite a primeira nota: "));
         nota2 = Integer.parseInt(IO.readln("digite a segunda nota: "));
         nota3 = Integer.parseInt(IO.readln("digite a terceira nota: "));

          // Soma das NOTAS

          int soma = nota1 + nota2 + nota3;
    
        // MEDIAS das NOTAS 

        media = soma / 3.0;

        // SAIDA das NOTAS, SOMA, e MEDIA

        IO.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        IO.println("Soma: " + soma);
        IO.println("Media: " + media);

    }
}
