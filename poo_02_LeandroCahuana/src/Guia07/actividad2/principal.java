package Guia07.actividad2;

import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
        
        plantas_02 obj1 = new plantas_02();
        obj1.especie = JOptionPane.showInputDialog("Ingrese especie: ");
        obj1.fruto = Boolean.parseBoolean(JOptionPane.showInputDialog("Da frutos (true/false): "));
        obj1.crecer();
        obj1.fruto();
        obj1.mostrarDatos();

    }

}
