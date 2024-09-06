package ap3.Actividad2;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Calculadora obj1 = new Calculadora(Double.parseDouble(JOptionPane.showInputDialog("Inserte primer valor: ")));
            System.out.println(obj1.sumar());
            System.out.println(obj1.restar());

        Calculadora obj2 = new Calculadora(Double.parseDouble(JOptionPane.showInputDialog("Inserte primer valor: ")), Double.parseDouble(JOptionPane.showInputDialog("Inserte segundo valor: ")));
            System.out.println(obj2.sumar());
            System.out.println(obj2.restar());

        Calculadora obj3 = new Calculadora(Double.parseDouble(JOptionPane.showInputDialog("Inserte primer valor: ")), Double.parseDouble(JOptionPane.showInputDialog("Inserte segundo valor: ")));
            System.out.println(obj3.sumar());
            System.out.println(obj3.restar());
    }

}
