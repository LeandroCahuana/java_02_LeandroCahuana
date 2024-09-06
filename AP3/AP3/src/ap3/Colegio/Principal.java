package ap3.Colegio;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        colegio obj1 = new colegio(JOptionPane.showInputDialog("Ingrese distrito: "), JOptionPane.showInputDialog("Ingrese nombre del colegio: "), JOptionPane.showInputDialog("Ingrese nombre del fundador: "));
        obj1.MostrarDatos();
        colegio obj2 = new colegio();
        colegio obj3 = new colegio(JOptionPane.showInputDialog("Ingrese distrito: "));
    }

}
