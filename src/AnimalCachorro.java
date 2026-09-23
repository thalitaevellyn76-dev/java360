import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AnimalCachorro extends Animal {
       
    //No processo de herança, o construtor não é herdado, mas pode ser chamado através do super().
    
    public AnimalCachorro(String nome, String tocarSom, String comer) {
        super(nome, tocarSom, comer);
    }

    
    @Override
    public void arquivoSom() {
        try {
            File arquivo = new File("src/latido.wav");

            AudioInputStream audio =
                    AudioSystem.getAudioInputStream(arquivo);

            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            IO.println("Cachorro latindo...");

            clip.start();

            Thread.sleep(clip.getMicrosecondLength() / 1000);

            clip.close();
            audio.close();

        } catch (Exception e) {
            IO.println("Erro ao reproduzir áudio: " + e);
        }
    }
    @Override
    public void comer() {
        IO.println("O cachorro está comendo ração.");
    }
    


        /*IO.println("***C A C H O R R O***");
        Animal Cachorro = new Animal("O cachorro se chama Max", "Max está latindo", "Max está comendo ração");
        IO.println(Cachorro.getNome());
        IO.println(Cachorro.getTocarSom());
        IO.println(Cachorro.getComer());
        */


}