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
public class MaquinaTac extends Maquina{

    public MaquinaTac(String identificador) {
        super(identificador);
    }
    
    public String toString(){
        return "TAC" + " " + this.identificador;
    }
}
