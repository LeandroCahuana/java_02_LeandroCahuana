package ap3.Colegio;

public class colegio {

    //Atributos
    String distrito, nombre, fundador;

    //Metodos
    public void MostrarDatos() {
        System.out.println("Distrito: " + distrito + "\nNombre del colegio: " + nombre + "\nFundador del colegio: " + fundador);
    }

    //Metodos Constructor
    public colegio() {
    }

    public colegio(String distrito) {
        this.distrito = distrito;
    }

    public colegio(String distrito, String nombre, String fundador) {
        this.distrito = distrito;
        this.nombre = nombre;
        this.fundador = fundador;
    }

    //Metodos
    public void datos() {
        System.out.println("Datos");
    }

    public void datos(int a, int c) {
        System.out.println("Datos2");
    }

    public void datos(String b) {
        System.out.println("Datos3");
    }

}
