import java.util.ArrayList;

public class Algoritmo49 {
    public static void main(String[] args) {

        ArrayList<String> laboratorios = new ArrayList<>();

        int opcao;

        do {
            IO.println("Qual laboratório deseja adicionar?");
            IO.println("F03, F05 ou F07");
            String laboratorio = IO.readln();

            laboratorios.add(laboratorio);

            IO.println("Deseja adicionar outro laboratório?");
            IO.println("1 - Adicionar");
            IO.println("2 - Sair");

            opcao = Integer.parseInt(IO.readln());

        } while (opcao == 1);

        IO.println("Quantidade de laboratórios adicionados: " + laboratorios.size());

        IO.println("Laboratórios adicionados:");

        for (String laboratorio : laboratorios) {
            IO.println(laboratorio);
        }
    }
}