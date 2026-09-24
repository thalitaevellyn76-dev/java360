public class Algoritmo44 {
    public void main(){
        //matriz unidimensional 2D
        //matriz bidimensional 2D
        //matriz tridimensional 3D
        //tensores (N dimensoes - Redes Neurais)
        //i,j: linha, coluna
        double[][] notas ={
            {100,80,40,30},
            {78,87,55,90},
            {67,78,34,56},
            {99,100,56,96},
        };
        //percorrer a linha
        for(int i=0;i<notas.length;i++){
          for(int j=0;j<notas[i].length;j++){
            IO.println(notas[1][j]);

          }
        }
    }
    
}
