public abstract class Veiculo {
    //atribustos

    private String placa;

    private String VelocidadeMax;

    private String tipoCombustivel;

    private String cor;
      public Veiculo() {
        super();
      }

    public Veiculo(String placa, String VelocidadeMax, String tipoCombustivel, String cor) {

        this.placa = placa;

        this.VelocidadeMax = VelocidadeMax;

        this.tipoCombustivel = tipoCombustivel;
        
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getVelocidadeMax() {
        return VelocidadeMax;
    }

    public void setVelocidadeMax(String VelocidadeMax) {
        this.VelocidadeMax = VelocidadeMax;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public abstract void mover();
    
}
