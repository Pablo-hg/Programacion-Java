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
public class MaquinaRayosX extends Maquina{

    public MaquinaRayosX(String identificador) {
        super(identificador);
    }
    
    public String toString(){
        return "RX" + " " + this.identificador;
    }
}
