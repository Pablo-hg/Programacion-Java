/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import static clinica.Eco.DURACION_ECO;

/**
 *
 * @author fer
 */
public class RayosX extends Prueba{
    public static final int DURACION_RADIO = 1;

    public RayosX(String id) {
        super(DURACION_RADIO, id, new Recurso[4]);
    }

    public static int getDURACION_RADIO() {
        return DURACION_RADIO;
    }
    
     public MaquinaRayosX getRX(){
        return (MaquinaRayosX)super.recursos[0];
    }
    public Medico getMedico(){
        return (Medico)super.recursos[1];
        
    }
    
    public Tecnico getTecnico(){
        return (Tecnico)super.recursos[2];
    }
    
    public SalaPolivalente getSala(){
        return (SalaPolivalente)super.recursos[3];
    }
    
}
