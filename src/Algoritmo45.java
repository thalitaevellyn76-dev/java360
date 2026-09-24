import java.util.List;

public class Algoritmo45 {

    public void main(){
        //java collections
        //java 5
        /*
            List (interface) ---> ArrayList(classe implementa) 

        
        */
       List<String> tarefas = List.of("testa mesa","algoritmo", "oo");
       for(String tarefa:tarefas){
        //singular - elemento
        //plural - colecao
        IO.println(tarefas);

       }
    }
    
}
