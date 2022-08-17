
package clinica;
public abstract class MaqyunaEco extends Maquina{

    public MaqyunaEco(String identificador) {
        super(identificador);
    }
    
    public String toString(){
        return "ECO" + " " + this.identificador;
    }
}
