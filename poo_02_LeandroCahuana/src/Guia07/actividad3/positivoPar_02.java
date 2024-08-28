
package Guia07.actividad3;

public class positivoPar_02 {
    
    //Atributos
    Double numero;
    String mensaje;
    
    //Metodos
    public String identificadorPositivo() {
        if (numero > 0 == true) {
            mensaje = "El " + numero + " es positivo";
        } else {
            if (numero == 0) {
                mensaje = "El " + numero + " es un número neutro";
            } else {
                mensaje = "El " + numero + " es negativo";
            }
        }
        return mensaje;
    }
    public String identificadorPar() {
        if ((numero %2 == 0) == true) {
            mensaje = "El " + numero + " es par";
        } else {
            if ((numero %2 != 0) == false) {
                mensaje = "El " + numero + " no es par";
            }
        }
        return mensaje;
    }
}
