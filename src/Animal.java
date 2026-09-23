import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public abstract class Animal {
    private String nome;
    private String tocarSom;
    private String comer;

    public Animal(String nome, String tocarSom, String comer) {
        this.nome = nome;
        this.tocarSom = tocarSom;
        this.comer = comer;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTocarSom() {
        return tocarSom;
    }

    public void setTocarSom(String tocarSom) {
        this.tocarSom = tocarSom;
    }

    public String getComer() {
        return comer;
    }

    public void setComer(String comer) {
        this.comer = comer;
    }

    //contratos -- assinatura
    public abstract void arquivoSom();
    public abstract void comer();

}