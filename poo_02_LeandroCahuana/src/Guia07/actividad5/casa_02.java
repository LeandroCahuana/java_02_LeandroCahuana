package Guia07.actividad5;

public class casa_02 {

    //Atributos
    String material;
    int pisos;

    //Metodos
    public casa_02(String material, int pisos) {
        this.material = material;
        this.pisos = pisos;
    }
    
    public void caracteristicas(){
        System.out.println("La casa es de "+material+" y cuenta con "+pisos+" pisos :)");
    }

    public void mostrarDatos() {
        System.out.println("\nDATOS" + "\nMaterial principal de la casa: " + material + "\nCantidad de pisos: " + pisos);
    }
}
