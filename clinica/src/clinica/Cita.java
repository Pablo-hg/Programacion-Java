
package clinica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author fer
 */
public class Cita implements Comparable<Cita> {
    
    private Prueba prueba;
    
    private Date fecha;
    
    private String id;
    
    public static int num_citas = 1;

    public Cita(Prueba prueba, Date fecha) {
        this.prueba = prueba;
        this.fecha = fecha;
        num_citas++;
        this.id = "" + num_citas;
        
    }

    public Prueba getPrueba() {
        return prueba;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getId() {
        return id;
    }

    public static int getNum_citas() {
        return num_citas;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void setNum_citas(int num_citas) {
        Cita.num_citas = num_citas;
    }
    
    public String toString(){
        
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        
        String fecha = df.format(this.fecha);
        
        return this.prueba.getClass().getName().toUpperCase() + this.id + " " + fecha;      
        
    }

    @Override
    public int compareTo(Cita o) {
        //Si la fecha de this es menor que la de o--> -1
        /*if (this.fecha.compareTo(o.fecha) < 0)
            return -1;
        
        //Si la fecha de this es mayor que la de o--> 1
        else if (this.fecha.compareTo(o.fecha) > 0)
            return 1;
        
        else
            return 0;*/
        
        //Si la fecha de this es igual que la de o--> 0
        
        return this.fecha.compareTo(o.fecha);
    }
    
    
    
    
}
