public class Onibus extends Transporte{

private static int Cont=0;

    public Onibus() {
        Cont++;
    }

    public Onibus(String placa) {
        super(placa);
        Cont++;
    }
    @Override 
    public double calcularTarifa(){
        return 3.80;
    }
    public static int getCont(){
        return Cont;
    }
}