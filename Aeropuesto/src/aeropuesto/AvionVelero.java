
package aeropuesto;

public class AvionVelero extends Avion{
    private double autonomia;

    public AvionVelero(double autonomia, String avionId, int numPasajeros) {
        super(avionId, numPasajeros);
        this.autonomia = autonomia;
    }

    @Override
    public boolean tieneMotor() {
      return false;
    }

    @Override
    public double calcularAutonomia() {
         return autonomia;
    }
}
