import javax.swing.JOptionPane;

public class Algoritmo39 {
    public void main(){
    /*
      Revisão: Classe Abstrata, interface, Polimorfismo,
       Encapsulamento e Status
      
      Transporte 
      Onibus
      Metro
    */

       Onibus O1 = new Onibus("PBG-1704");
       Onibus O2= new Onibus("FRH-3899");
       Onibus O3 = new Onibus("HFK-3904");

       Metro M1 = new Metro("ABD-4950");
       Metro M2 = new Metro("LFO-1615");
       Metro M3 = new Metro("LAI-9837");
   
    
         String opcao = JOptionPane.showInputDialog("1-Onibus 2-Metro 3-Sair");
         int op = Integer.parseInt(opcao);
         do{
    if (op==1) {
        JOptionPane.showInputDialog(null, O1.calcularTarifa());
        JOptionPane.showInputDialog(null,"Frota"+Onibus.getCont());
    }else if (op==2) {  
        JOptionPane.showMessageDialog(null, M1.calcularTarifa()); 
    }else if (op==3) {  
         JOptionPane.showMessageDialog(null, "Fechando Sistema");
    }else{
        JOptionPane.showMessageDialog(null, "opcao inválida", "SENAI", JOptionPane.ERROR_MESSAGE);
    }

    }while (op !=3);
     

     }

   }