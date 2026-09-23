public class Algoritmo34 {
    
    //ENCAPSULAMENTO
    //public - private - protected - package
    //public - todo mundo acessa
    //private - só a própria classe acessa
    //protected - apenas as classes autorizadas acessam
    //package - só as classes do mesmo pacote acessam
    private int primeiroNumero; //atributo
    private int segundoNumero; // atributo

    public void setPrimeiroNumero(int primeiroNumero) {
        /*atributo-receber-guardar "="" */
        this.primeiroNumero = primeiroNumero;
    }
    public int getPrimeiroNumero() {
        return primeiroNumero;
    }
    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
    public int getSegundoNumero() {
        return segundoNumero;
    }

}