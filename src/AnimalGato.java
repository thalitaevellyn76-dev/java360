import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AnimalGato extends Animal {
    public AnimalGato(String nome, String tocarSom, String comer) {
        super(nome, tocarSom, comer);
    }

    @Override
    public void arquivoSom() {
        try {
            File arquivo = new File("src/miado2.wav");

            AudioInputStream audio =
                    AudioSystem.getAudioInputStream(arquivo);

            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            IO.println("Gato miando...");

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
        System.out.println("O gato " + getNome() + " come " + getComer());
    }
}