public class Algoritmo29 {
    public void main() {
      
        double[] vendas = new double[12];
        double totalVendas = 0;

        for (int i = 0; i < vendas.length; i++) {
            vendas[i] = Double.parseDouble(IO.readln("Digite o valor das vendas do mês " + (i + 1) + ": "));
            totalVendas += vendas[i]; // Acumula o valor total
        }
        double mediaAnual = totalVendas / vendas.length;

        IO.println("\n=== RESUMO DAS VENDAS ANUAIS ===");
        IO.println("Total de vendas no ano: R$ " + String.format("%.2f", totalVendas));
        IO.println("Média mensal de vendas: R$ " + String.format("%.2f", mediaAnual));
    }
}
