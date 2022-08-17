
package aeropuesto;

public class AvionMotor extends Avion {
    
    private double combustible;//galones
    
    private double millasPorgalon;//millas/galon

    public AvionMotor(double combustible, double millasPorgalon, String avionId, int numPasajeros){
        super(avionId, numPasajeros);
        this.combustible = combustible;
        this.millasPorgalon = millasPorgalon;
    }
  
    
    @Override
    public boolean tieneMotor() {
       return true; 
    }

    @Override
    public double calcularAutonomia() {
        return this.combustible*this.millasPorgalon;
    }
    
     
    public int compareTo(AvionMotor o) {
        if (this.calcularAutonomia() < o.calcularAutonomia())
            return -1;
        else if (this.calcularAutonomia() == o.calcularAutonomia())
            return 0;
        else //(this.calcularAutonomia() > o.calcularAutonomia())
            return 1;
    }
}
