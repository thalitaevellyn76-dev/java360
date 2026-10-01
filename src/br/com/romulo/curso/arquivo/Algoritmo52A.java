package br.com.romulo.curso.arquivo;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;         // data E hora juntos
import java.time.format.DateTimeFormatter; // moldura do formato

public class Algoritmo52A {
    void main(){        
        int r=0;
        do{              

                // 1️⃣ O formato do carimbo: dia/mês/ano às hora:minuto:segundo
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

                IO.println("Digite sua mensagem: ");
                String mensagem = IO.readln();

                // 2️⃣ Carimbo capturado no momento do registro
                String carimbo = LocalDateTime.now().format(formato);

                try (FileWriter arquivo = new FileWriter("diario.txt", true)) { // true = NÃO apagar, adicionar!
                    arquivo.write("[" + carimbo + "] " + mensagem + "\n");      // 3️⃣ carimbo + mensagem + pula linha
                    IO.println("✅ Registrado: [" + carimbo + "] " + mensagem);
                    IO.println("Deseja registrar nova mensagem  1-sim 0-não: ");
                    r = Integer.parseInt(IO.readln());
                } catch (IOException e) {
                    IO.println("❌ Erro ao salvar no diário: " + e.getMessage());
                }


        }while(r==1);
    
    }
}