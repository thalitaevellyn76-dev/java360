public class Algoritmo47 {
    public void main(){
        //faca um vetor aramazene 10 valores inteiros
        //io.println()   io.readln()
        //imprima a media so valores.
         double[] valores = new double [10];
         double soma =0;
        //percorrer a linha
        for(int i=0;i<valores.length;i++){  
           
         valores[i]= Integer.parseInt(IO.readln("ler o numero:"));
         soma = soma + valores[i];
        }
        //percorrer a linha
         double media = soma / valores.length;
         for(int i=0;i<valores.length;i++){  

            IO.println("imprimir os valores:"+ valores [i]);

        }
      
        IO.println("a media dos valores e:"+media);
    }
    
}


    

