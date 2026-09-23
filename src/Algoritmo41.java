public class Algoritmo41 {

    public void main(){
        //matrizes
        //matriz bidimensional (2D)
        //2x2 (matriz quadrada)-mesma qtde de l, c 
        /*
           i: identifica o numero da linha (horizontal).
           j: identifica o numero da coluna (vertical)
         */
        int[][] m = {{21,25},{33,35}};
        int soma=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                soma+= m[i][j];
            }
        }         
        IO.print(soma);

    }
    
}
