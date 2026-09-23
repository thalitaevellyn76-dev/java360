public class Carro extends Veiculo{
    private int numPortas;
    public Carro() {
      super();
    }
    public Carro(String cor, String placa, String tipoCombustivel, String velocidadeMax, int numPortas) {
        super(cor, placa, tipoCombustivel, velocidadeMax);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    @Override
    public void mover(){
        IO.print("O Carro está se movendo!");
    }
}