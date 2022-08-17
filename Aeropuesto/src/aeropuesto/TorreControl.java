
package aeropuesto;

import java.util.ArrayList;
import java.util.List;

public class TorreControl {
    private String nombreAeropueto;
    
    private List<Avion> vuelos;
    
    private Parking Parking;

    public TorreControl(String nombreAeropueto, Parking parking) {
        this.nombreAeropueto = nombreAeropueto;
        this.Parking = parking;
        this.vuelos = new ArrayList<Avion>();
    }
    
    public void anadirAvion(Avion avion){
        this.vuelos.add(avion);
    }
    
    public int getSigAvionPos(){
        int pos = -1;
        
        double min = Double.MAX_VALUE;
        for (int i = 0; i < this.vuelos.size(); i++)
            if (min > this.vuelos.get(i).calcularAutonomia()){
                min = this.vuelos.get(i).calcularAutonomia();
                pos = i;
            }
        return pos;    
    }
    
     public boolean aparcarSigAvion(){
        if (this.getSigAvionPos() == -1)
            return false;
        else{
            this.Parking.aparcarAvion(this.vuelos.get(this.getSigAvionPos()));
            this.vuelos.remove(this.getSigAvionPos());
            return true;
        }
    }
     
     public String listarAvionesParking(){
        return this.Parking.listarAviones();
    }
}
