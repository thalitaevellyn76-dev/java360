package br.com.src.curso.arquivo;
import java.util.HashMap;//pacote
import java.util.Map;//pacote
//pacote é util
//Classe ou Interface dentro do pacote
/*
  Um pacote é um conjunto de classe
  e ou interfaces.

  Você pode criar o seu pacote
  Ou utilizar pacote dos outros

*/

public class Algoritmo53A {
    void main(){
        //Aurélio (dicionário)
        //Chave - Valor
        //Manga - "fruta tropical"
        //Teclado -"Instrumento musical"
        //Java - "Arquipélago na Indonésia"
        //Dictionary - Dicionário
        //JSON - (chave,valor) - JavaScript
        //Dictionary (absoleta)-[Legado]
        // Map<String, Aluno> dicionarioAlunos = new HashMap<>();
        //Generics - Definir Qualquer Tipo <T> - Generico
        //Toda a classe Object
        Map<String,Estudante> estudantes = new HashMap<>();
        // dicionarioAlunos.put("MAT-2026-001", new Aluno("Ana Silva", "Engenharia de Software", 2026)); 
        IO.println("Java Doctor - Escola  de Programação");
        Estudante e1 = new Estudante("JP","ADS",2025);
        estudantes.put("MAT-1223",e1);  
        Estudante e2 = new Estudante("Elias","Ciência da Computação",2023);
        estudantes.put("MAT-1224",e2);
        Estudante e3 = new Estudante("Daniel","Publicidade e Propaganda",2016);
        estudantes.put("MAT-1225",e3);
        Estudante e4 = new Estudante("Cassio","ADS",2015);
        //manutenção na classe - adicionar atributo abandonou (booleano)
        estudantes.put("MAT-1226",e4);
        Estudante e5 = new Estudante("Natália","Ciência da Computação",2027);
        estudantes.put("MAT-1227",e5);
        Estudante e6 = new Estudante("Maria Eduarda","ADS",2028);
        estudantes.put("MAT-1228",e6);
        Estudante e7 = new Estudante("Julio Cezar","TSI",2028);
        estudantes.put("MAT-1229",e7);
        Estudante e8 = new Estudante("Gabriel I","AutodiData",2026);
        estudantes.put("MAT-1230",e8);
        Estudante e9 = new Estudante("Fabio Pio","Marketing",2026);
        estudantes.put("MAT-1231",e9);
        Estudante e10 = new Estudante("Carlos","ADS",2016);
        estudantes.put("MAT-1232",e10);
        Estudante e11 = new Estudante("Gabriel II","Engenharia de Software",2028);
        estudantes.put("MAT-1233",e11);
        Estudante e12 = new Estudante("Thalita","ADS",2026);
        estudantes.put("MAT-1234",e12);
        estudantes.put("MAT-1235",new Estudante("Rômulo","GTI",2012));
        // Listar todos os estudantes cadastrados
        for (Estudante e : estudantes.values()) {
            IO.println(e);
        }
       
        // Listar todos os estudantes com a matrícula
        //aurelio.get("manga")
            for (String matricula : estudantes.keySet()) {
              Estudante e = estudantes.get(matricula);
              IO.println(matricula + " -> " + e);
        }   
        // Buscar pela matricula  
        // Buscar pela matricula
        IO.println("Digite a matricula");
        String busca = IO.readln();
        Estudante encontrado = estudantes.get(busca.trim().toUpperCase());

        if (encontrado != null) {
           IO.println("Encontrado: " + busca + " -> " + encontrado);
        } else {
           IO.println("Matrícula " + busca + " não encontrada.");
        }    
        IO.print("Daniel -----");
        for (Map.Entry<String, Estudante> entry : estudantes.entrySet()) {
            String matricula = entry.getKey();
            Estudante estudante = entry.getValue();
            IO.println("Matrícula: " + matricula + " | Nome: " + estudante.getNome() + " | Curso: " + estudante.getCurso() + " | Ano: " + estudante.getAno());
            IO.println("\n---------------------------\n");
        }

    }

}