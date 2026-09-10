import java.util.List;

public class AlgoritmoVinte {
    public static void main(String[] args) {
        
        List<String> cupons = List.of("PROMO10", "DESCONTO20", "FRETEGRATIS", "PIX5");

        cupons.forEach(System.out::println);
    }
}