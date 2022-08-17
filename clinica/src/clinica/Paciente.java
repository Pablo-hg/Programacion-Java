/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fer
 */
public class Paciente extends Persona{
    
    private List<Cita> citas;

    public Paciente(String nombre, String apellidos, String sexo, Date fecha_nac, DNI dni) {
        super(nombre, apellidos, sexo, fecha_nac, dni);
        this.citas = new ArrayList<Cita>();
    }

    public List<Cita> getCitas() {
        return citas;
    }
    
    public boolean comprobarCita(Date fecha){
        
       //Comprobaremos si la fecha que nos pasan está libre en nuestra lista de Citas 
       boolean libre = true;
       
       int i = 0;
       
       while(i < this.citas.size() && libre) // libre == true
           if (this.citas.get(i).getFecha().compareTo(fecha) == 0)
               libre = false;
       
       return libre;
    }
    
    
    
}
