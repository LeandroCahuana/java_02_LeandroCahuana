package Guia07.actividad3;

import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
        
        positivoPar_02 obj1 = new positivoPar_02();
        
        obj1.numero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un número: "));
        
        String mensaje1 = obj1.identificadorPar();
        String mensaje2 = obj1.identificadorPositivo();
        
        System.out.println(mensaje1+"\n"+mensaje2);

    }

}
