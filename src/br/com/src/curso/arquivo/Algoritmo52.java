package br.com.src.curso.arquivo;
import java.io.FileWriter; //arquivo
import java.io.IOException; //erro
import java.time.LocalDateTime; // data e hora
import java.time.format.DateTimeFormatter; //formata

public class Algoritmo52 {
      
    void main(){

         int r = 0;
         do{

               //1️⃣ o formato do carimbo: dia/mes/ano as horas:minutos:segundo:
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

              //amanha - manipular aqui...
                IO.println("digite uma duvida");
                String duvida = IO.readln();

                //2️⃣ carimbo capturado no momento do registro
                String carimbo =LocalDateTime.now().format(formato);
                
             try(FileWriter arquivo = new FileWriter("registro.txt",true)){
                arquivo.write("[" + carimbo + "]" + duvida +"\n");
                IO.println("✅ Registrado: [" + carimbo + "]" +duvida);
                IO.println("desejar registrar nova mensagem 1-sim 0-nao: ");
                r = Integer.parseInt(IO.readln());


             }catch(IOException e){
                IO.println("erro ao salvar a sua duvida:" +e.getMessage());

             }

            IO.println("adicionar msg:1 [sim] 0[nao]");
            r = Integer.parseInt(IO.readln());

           }while(r==1);
    }
    

    
}
