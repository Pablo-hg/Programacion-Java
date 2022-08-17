
package aeropuesto;

public abstract class Avion {
    private String avionId;
    
    private int numPasajeros;
    
    
     public Avion(String avionId, int numPasajeros) {
        this.avionId = avionId;
        this.numPasajeros = numPasajeros;
    }
     
      public String getAvionId() {
        return avionId;
    }
      
    public int numPasajeros() {
      return numPasajeros;
    }
    
    
    public abstract boolean tieneMotor();
    
    public abstract double calcularAutonomia();
}
