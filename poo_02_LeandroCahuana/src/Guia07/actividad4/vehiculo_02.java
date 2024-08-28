
package Guia07.actividad4;

public class vehiculo_02 {
    
    //Atributos
    String marca;
    String modelo;
    
    //Metodos
    public void movimiento(Boolean estado) {
        if (estado == true) {
            System.out.println("El " + marca + " " + modelo + " se encuentra en movimiento");
        } else {
            System.out.println("El " + marca + " " + modelo + " no esta en movimiento");
        }
    }
    public void estado (Boolean estadoActual){
        if (estadoActual == true){
            System.out.println("El " + marca + " " + modelo + " es nuevo");
        } else {
            System.out.println("El " + marca + " " + modelo + " no es nuevo");
        }
    }
}
