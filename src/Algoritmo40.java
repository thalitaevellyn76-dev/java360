public class Algoritmo40 {
    
     public void main(){
        //vetor - matriz unidimensional
        /*
        tabela - matriz bidimensional
        30 - matriz tridimensional
       //cinema, desenhos, animacoes,games (gta 6) 
       //autoCA, revit, sketchup
       //humanoide - softwares 3D simulacao
       //Minecraft x, y e z
      */
     //vetor ou matriz unidimensional
     //https://www.somamatematica.com.br/emedio/matrizes/matriz
     //matriz linha ou matriz coluna
     //              0 1 2 3 4
     int[] notas = {7,9,5,10,6};
     int maior = notas[0];
     IO.println(maior);
     // Muito util para big data
     for(int i=1;i<notas.length;i++){
        if(notas[i] > maior){
            maior = notas[i];
        }

     }
     IO.println("Maior notas:"+maior);
     }



    
}
