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
public class Trabajador extends Persona implements Recurso{
    
    private List<Cita> citas;

    public Trabajador(String nombre, String apellidos, String sexo, Date fecha_nac, DNI dni) {
        super(nombre, apellidos, sexo, fecha_nac, dni);
        this.citas = new ArrayList<Cita>();
    }
    
    public String acadena(){
        //return super.getDni().toString();
        return this.getDni().toString();
    }
    
}
