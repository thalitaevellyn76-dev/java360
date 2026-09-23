public class Algoritmo33 {

    private int chave; // atributo

    public void inserirchave(int c) {
        chave = c;
    }

    public int retornarChave() {
        return chave;
    }
    public String retornarChaveString() {
        return Integer.toString(chave);
    }
    public String abrirPorta(){
        String resposta;
        if (chave == 7) {
            resposta = "A porta verde-água se abre;";
        } else {
            resposta = "A porta de cobre se abre";
        }
        return resposta;
    }
}