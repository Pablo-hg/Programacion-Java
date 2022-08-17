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
public class Tac extends Prueba{
    
    public static final int DURACION_TAC = 3;

    public Tac(String id) {
        super(DURACION_TAC, id, new Recurso[5]);
    }

    public static int getDURACION_TAC() {
        return DURACION_TAC;
    }
    
    public MaquinaTac getTac(){
        return (MaquinaTac)super.recursos[0];
    }
    public Medico getMedico(){
        return (Medico)super.recursos[1];
        
    }
    
    public Medico getMedico2(){
        return (Medico)super.recursos[2];
        
    }   
    
    
    public Tecnico getTecnico(){
        return (Tecnico)super.recursos[3];
    }
    
    public SalaPolivalente getSala(){
        return (SalaPolivalente)super.recursos[4];
    }
    
    
}
