/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.util.ArrayList;
import java.util.List;

public abstract class Maquina implements Recurso{
    
   String identificador;
    
    private List<Cita> citas;

    public Maquina(String identificador) {
        this.identificador = identificador;
        citas = new ArrayList<Cita>();
    }

    public List<Cita> getCitas() {
        return citas;
    }
    
    

    public String getIdentificador() {
        return identificador;
    }
    
    public String acadena(){
        return identificador;
    }
}
