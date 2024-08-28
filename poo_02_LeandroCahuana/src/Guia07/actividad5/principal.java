package Guia07.actividad5;

import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {

        casa_02 obj1 = new casa_02(JOptionPane.showInputDialog("Material de la casa: "), Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pisos: ")));

        obj1.caracteristicas();
        obj1.mostrarDatos();
    }

}
