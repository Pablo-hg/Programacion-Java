
package clinica;
public abstract class MaquibaRayosx extends Maquina{
    
    //constructor de maquina
    public MaquibaRayosx(String identificador) {
        super(identificador);
    }
    
    public String toString(){
        return "RX" + " " + this.identificador;
    }
    
}
