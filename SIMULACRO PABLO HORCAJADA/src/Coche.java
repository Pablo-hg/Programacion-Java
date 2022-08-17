
public class Coche  extends Vehiculo implements Comparable<Coche>{
    
    private boolean esGasolina;
    
    private int prioridad;

    public Coche(String marca, String modelo, String matricula) {
        super(marca, modelo, matricula);
        this.esGasolina = esGasolina;
        this.prioridad = prioridad;
    }
    
     public boolean esGasolina() {
        return esGasolina;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    public String getMarca(){
        return super.getMarca();
    }
    
    public int compareTo(Coche o) {
        if (this.prioridad == o.prioridad)
            return 0;
        else if (this.prioridad < o.prioridad)
            return - 1;
        else // this.prioridad > o.prioridad
            return 1;
    }
}
