package ap3.celular;

import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
        Celular obj1 = new Celular(JOptionPane.showInputDialog("Ingrese modelo del celular:"), JOptionPane.showInputDialog("Ingrese marca del celular:"), JOptionPane.showInputDialog("Ingrese color del celular:"));
        obj1.encender();
        obj1.apagar();
        obj1.mostrarDatos();
        Celular obj2 = new Celular();
        obj2.encender();
        obj2.apagar();
        Celular obj3 = new Celular(JOptionPane.showInputDialog("Ingrese modelo del celular:"));
        obj3.encender();
        obj3.apagar();

    }

}
