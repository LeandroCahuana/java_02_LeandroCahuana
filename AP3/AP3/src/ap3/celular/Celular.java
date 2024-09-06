package ap3.celular;

public class Celular {

    //Atributos
    String modelo, marca, color;

    //Metodo
    public void encender() {
        System.out.println("El celular se encendio");
    }

    public void apagar() {
        System.out.println("El celular se apago");
    }

    public void mostrarDatos() {
        System.out.println("Modelo : " + modelo + "\nMarca : " + marca + "\nColor : " + color);
    }

    //Metodos constructor
    public Celular() {
    }

    public Celular(String modelo) {
        this.modelo = modelo;
    }

    public Celular(String modelo, String marca, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    //Metodos
    public void nuevo_celular() {
    }

    public void nuevo_celular(String a, float c) {
    }

    public void nuevo_celular(int b) {
    }
}
