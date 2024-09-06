package ap3.Actividad2;

public class Calculadora {
    
    //Atributos
    Double x, y;
    
    //Metodos constructores
    public Calculadora(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Calculadora(Double y) {
        this.y = y;
    }

    public Calculadora() {
        
    }
    
    //Metodos
    public String sumar (){
        Double total = x + y;
        return Double.toString(total);
    }
    public String restar (){
        Double total = x + y;
        return Double.toString(total);
    }
}
