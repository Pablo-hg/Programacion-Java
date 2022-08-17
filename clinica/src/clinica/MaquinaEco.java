
package clinica;

public class MaquinaEco extends Maquina{

    public MaquinaEco(String identificador) {
        super(identificador);
    }
    
    public String toString(){
        return "ECO" + " " + this.identificador;
    }
}
