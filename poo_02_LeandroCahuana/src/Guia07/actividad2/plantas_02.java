package Guia07.actividad2;

public class plantas_02 {
    
    //Atributos
    String especie;
    boolean fruto;
    
    //metodos
    public void crecer(){
        System.out.println("La planta '"+especie+"' esta creciendo");
    }
    public void fruto(){
        if(fruto == true){
            System.out.println("La planta '"+especie+"' dio frutos");
        } else {
            System.out.println("La planta '"+especie+"' no dio frutos");
        }
    }
    
    public void mostrarDatos(){
        System.out.println("\nDATOS"+"\nEspecie: "+especie +"\nDa frutos: "+fruto
        );
    }
}
