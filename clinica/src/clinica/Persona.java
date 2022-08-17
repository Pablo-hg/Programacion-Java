
package clinica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Persona {
    
    private String nombre;
    
    private String apellidos;
    
    private String sexo;
    
    private Date fecha_nac;
    
    private DNI dni;

    public Persona(String nombre, String apellidos, String sexo, Date fecha_nac, DNI dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fecha_nac = fecha_nac;
        this.dni = dni;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public DNI getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }
    
    @Override
    public String toString(){
        
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        
        String fecha = df.format(fecha_nac);
        
        return this.nombre + " " + this.apellidos + " " + this.sexo
               + " " + this.dni.toString() + " " + fecha;
    }
    
}
