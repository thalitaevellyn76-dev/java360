package br.com.src.curso.poo;

import javax.swing.JOptionPane;

public class Algoritmo38 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Agência Senaicar");
        
        Carro c = new Carro("azul ", "SDF-2341", "Hibrido Flex", "220", 4);
        
        JOptionPane.showMessageDialog(null, c.getPlaca());
        JOptionPane.showMessageDialog(null, c.getCor());
        JOptionPane.showMessageDialog(null, c.getTipoCombustivel());
        JOptionPane.showMessageDialog(null, c.getNumPortas());
        JOptionPane.showMessageDialog(null, c.getVelocidadeMax());
        
        c.mover();
    }
}