import java.util.List;
import java.util.ArrayList;

public class Algoritmo46{
    public void main(){
        //List (Lista) - 100,40,50.56
        //Dictionary (Dicionario) - 100:Maria,40:jp,50:Daniel, 56:Cassio
        //pesquisa:
        /*
           gpt ou google (Collections java)
           4 interfaces
           4 classes

        */
          //ArrayList implementa (Lista)
          //HashMap implementa Map (chave - valor)
          //hashset implementa Set (conjunto)
          //linkendList implementa queue (fila)
          
          List<String> frutas = new ArrayList<>();

          frutas.add("Goiaba");
          frutas.add("Amora");
          frutas.add("Melancia");
          frutas.add("Mamao");

          IO.println("primeira fruta:"+frutas.get( 0));
          IO.println(frutas);
          frutas.set(1,"Uva");
          for(String fruta:frutas){
            IO.println("elemento:"+fruta);
          }
          IO.println("total de frutas:"+frutas.size());
          frutas.remove("Mamao");
          frutas.remove("Goiaba");
          frutas.remove("Melancia");
          IO.println("total de frutas:"+frutas.size());
          IO.println("lista"+frutas);
          frutas.add("laranja");
          frutas.add("Morango");
          IO.println("lista"+frutas);
          frutas.remove(1);
          IO.println("listas"+frutas);
    }

}