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
public class Eco extends Prueba{

    public static final int DURACION_ECO = 1;
    //recursos: 1 ecógrafo-> pos 0 del array, 1 médico-> pos 1 del array
    //y una Sala polivalente-> pos 2 del array
    public Eco(String id) {
        super(DURACION_ECO, id, new Recurso[3]);
    }

    public static int getDURACION_ECO() {
        return DURACION_ECO;
    }
    
    public MaquinaEco getEcografo(){
        return (MaquinaEco)super.recursos[0];
    }
    public Medico getMedico(){
        return (Medico)super.recursos[1];
        
    }
    
    public SalaPolivalente getSala(){
        return (SalaPolivalente)super.recursos[2];
    }
    
    
}
