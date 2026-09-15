public class AlgoritmoTresAL {
    void main() {

int chave = Integer.parseInt(IO.readln("Digite o número da chave: "));

if (chave == 7) {
IO.println("A porta verde-água se abre.");
} else {
IO.println("A porta cobre se abre.");
}

String classe = IO.readln("Escolha: guerreiro, mago, ladino ou clerigo: ");

if (classe.equals("guerreiro")) {

IO.println("A porta do escudo se abre.");

} 

else if (classe.equals("mago")) {

IO.println("A porta do livro se abre.");

} 

else if (classe.equals("ladino")) {

IO.println("A porta da chave se abre.");

} 

else if (classe.equals("clerigo")) {

IO.println("A porta da chave se abre.");

} 

else {

IO.println("A porta da espada se abre, por padrão.");
}

int nivel = Integer.parseInt(IO.readln("Nível: "));

boolean temChave = IO.readln("Tem a chave? (sim/nao):").equals("sim");

if (nivel >= 5 && temChave) {

IO.println("O guardião se curva. Pode passar.");

} 
else {

IO.println("O guardião nega com a cabeça.");

}
String simbolo = IO.readln("Pise em qual símbolo? ");

String resultado = switch (simbolo) {

case "sol" -> "O selo aquece sob seus pés.";

case "lua" -> "O selo esfria e brilha em prata.";

case "estrela" -> "O selo ergue uma escada de luz.";

default -> "O selo permanece em silêncio.";

};

IO.println(resultado);

}

}