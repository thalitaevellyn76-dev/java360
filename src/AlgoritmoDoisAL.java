public class AlgoritmoDoisAL { 

    void main() {
      IO.println("Quem ousa entrar na Sala do Eco?");

      String nome = IO.readln();

      IO.println("Ah... " + nome + ". Eu esperava por você.");

      IO.println("Quantos algoritmos você já venceu?");

      String resposta = IO.readln();

      int total = Integer.parseInt(resposta);

      IO.println("Só mais " + (360 - total) + " pela frente.");
}
}