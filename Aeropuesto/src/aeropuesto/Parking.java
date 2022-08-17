
package aeropuesto;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    
    private String nombreParking;
    
    private List<Avion> hangar;

    public Parking(String nombreParking) {
        this.nombreParking = nombreParking;
        this.hangar = new ArrayList<Avion>();
    }
    
    public void aparcarAvion (Avion avion){
        this.hangar.add(avion);
    }
    
    public String listarAviones(){
        String cad = "";
        for (int i = 0; i < this.hangar.size(); i++)
            cad = cad + this.hangar.get(i).getAvionId() +
                    "(" + this.hangar.get(i).numPasajeros() + ")" + ",";
        return cad;      
    }
}
