package br.com.romulo.curso.poo;

import javax.swing.JOptionPane;

public class Algoritmo39 {
    public static void main(String[] args) {
        /*
        Revisão: Classe Abstrata, Interface, Polimorfismo,
        Encapsulamento e Status

        Transporte
        Onibus
        Metro
        */

        Onibus o1 = new Onibus("PBG-1704");
        Onibus o2 = new Onibus("FRH-3899");
        Onibus o3 = new Onibus("HFK-3904");

        Metro m1 = new Metro("ABD-4950");
        Metro m2 = new Metro("LFO-1615");
        Metro m3 = new Metro("LAI-9837");

        String opcao = JOptionPane.showInputDialog("1-Onibus 2-Metro 3-Sair");
        int op = Integer.parseInt(opcao);

        do {
            if (op == 1) {
                JOptionPane.showInputDialog(null, o1.calcularTarifa());
                JOptionPane.showInputDialog(null, "Frota" + Onibus.getCont());
            } else if (op == 2) {
                // Lógica correspondente ao Metro...
            }
        } while (op != 3);
    }
}