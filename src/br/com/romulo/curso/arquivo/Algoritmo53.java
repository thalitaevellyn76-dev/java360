package br.com.romulo.curso.arquivo;
import java.util.HashMap; //Pacote
import java.util.Map; //pacote
//pacote e util
//classe ou interface dentro do pacote
/*
   um pacote e um cojunto de classe e ou interfaces.
   
   voce pode criar o seu pacote*/
public class Algoritmo53 {

    void main(){
        //Aurelio (dicionario)
        //chave - valor
        //manga - "fruta tropical"
        //teclado -"instrumento musical"
        //java - "arquipelago na indonesia"
        //Dictionary - dicionario
        //JSON - (chave, valor) - javascript
        //dictionary (absoleta) - legado
        //Map<String, Aluno> dicionarioAlunos = new hashMap();
        //Generics - definir qualquer tipo <T> - generico
        // toda a classe object

        Map<String, Estudante> estudantes =new HashMap<>();

    IO.println("Java Doctor - Escola de Programação");    
    Estudante e1 =new Estudante ("jp","ADS", 2025);
    estudantes.put("MAT-1223", e1);
    Estudante e2 = new Estudante("Elias", "Ciência da Computação", 2023);
    estudantes.put("MAT-1224", e2);
    Estudante e3 = new Estudante("Daniel", "Publicidade e Propagando", 2023);
    estudantes.put("MAT-1225", e3);
    Estudante e4 = new Estudante("Cassio", "ADS", 2015);
    estudantes.put("MAT-1226", e4);
    Estudante e5 = new Estudante("Natalia", "ciêcia da Computação", 2027);
    estudantes.put("MAT-1227", e5);
    Estudante e6 = new Estudante("Maria Eduarda", "ADS", 2028);
    estudantes.put("MAT-1228", e6);
    Estudante e7 = new Estudante("Julio cesar", "TSI", 2028);
    estudantes.put("MAT-1229", e7);
    Estudante e8 = new Estudante("Gabriel I", "AutodiData", 2028);
    estudantes.put("MAT-1230", e8);
    Estudante e9 = new Estudante("fabio pio", "Marketing", 2026);
    estudantes.put("MAT-1231", e9);
    Estudante e10 = new Estudante("Carlos", "ADS", 2016);
    estudantes.put("MAT-1232", e10);
    Estudante e11 = new Estudante("Gabriel II", "Engenharia de software", 2028);
    estudantes.put("MAT-1233", e11);
    Estudante e12 = new Estudante("Thalita", "ADS", 2026);
    estudantes.put("MAT-12234", e12);
    estudantes.put("MAT-1235", new Estudante("Romulo","GTI", 2012));

    //listar todos os estudantes cadastrados
    for(Estudante e : estudantes.values()) {
        IO.println(e);
    }

    //Buscar um estudate pela matricula
    //listar todos os estudantes com a matricula

    for (String matricula : estudantes.keySet()) {
        Estudante e = estudantes.get(matricula);
        IO.println(matricula +"->" + e);

        //Buscar pela matricula
        IO.println("digite a matricula");
        String busca = IO.readln();
        Estudante encontrado = estudantes.get(busca);

        if(encontrado != null){
            IO.println("encontrado: " + busca + " -> " + encontrado);
        }else {
            IO.println("matricula " + busca + "nao encontrada. ");
        }
        IO.print("Daniel -----");
        for(Map.Entry<String, Estudante> entry : estudantes.entrySet());
    }

    
}
    
}
