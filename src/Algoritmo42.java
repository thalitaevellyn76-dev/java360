import java.util.List;
import java.util.ArrayList;
public class Algoritmo42 {
public void main(){
    //java 5 
    //james gosling
    //colecao/colecoes (figurinhas)
    //collections
    //antes do java 5 - calca normal 
    //a partir do java 5 - calca lycra
    //primeira voz(bruno): interface (contrato)
    //segunda voz(marrone): classe (implementa)
    // List<String> nomes = new ArrayList<>();
    List<String> linguagens = List.of("Rust", "python", "GO", "java", "c", "c++", "c#");
    for(String linguagem:linguagens){
        IO.println(linguagem);
    }
}
    
}
