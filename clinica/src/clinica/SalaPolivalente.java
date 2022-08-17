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
public class SalaPolivalente extends Maquina{

    public SalaPolivalente(String identificador) {
        super(identificador);
    }
    
    public String toString(){
        return this.identificador;
    }
    
}
