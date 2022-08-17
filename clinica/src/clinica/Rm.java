/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;



/**
 *
 * @author fer
 */
public class Rm extends Prueba{
    public static final int DURACION_RES = 2;

    public Rm(String id) {
        super(DURACION_RES, id, new Recurso[5]);
    }

    public static int getDURACION_RES() {
        return DURACION_RES;
    }
    
    public MaquinaRm getRM(){
        return (MaquinaRm)super.recursos[0];
    }
    public Medico getMedico(){
        return (Medico)super.recursos[1];
        
    }
    
    public Tecnico getTecnico(){
        return (Tecnico)super.recursos[2];
    }
    
    public Tecnico getTecnico2(){
        return (Tecnico)super.recursos[3];
    }
    
    public SalaPolivalente getSala(){
        return (SalaPolivalente)super.recursos[4];
    }
    
    
    
}
