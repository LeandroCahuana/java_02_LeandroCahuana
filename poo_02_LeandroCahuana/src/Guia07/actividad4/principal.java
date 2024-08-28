package Guia07.actividad4;

import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {

        vehiculo_02 obj1 = new vehiculo_02();
        obj1.marca = JOptionPane.showInputDialog("Ingrese la marca: ");
        obj1.modelo = JOptionPane.showInputDialog("Ingrese el modelo: ");
        obj1.estado(Boolean.parseBoolean(JOptionPane.showInputDialog("¿Es nuevo?(true/false)")));
        obj1.movimiento(Boolean.parseBoolean(JOptionPane.showInputDialog("¿Se encuentra en movimiento?(true/false)")));
    }

}
