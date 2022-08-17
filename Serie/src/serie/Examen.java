
package serie;

import java.io.Serializable;

public class Examen implements Serializable{
    
    private int nota;
    private String enunciado;
    private Fecha f;

    public Examen(int nota, String enunciado, Fecha f) {
        this.nota = nota;
        this.enunciado = enunciado;
        this.f = f;
    }

    public int getNota() {
        return nota;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public Fecha getF() {
        return f;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setF(Fecha f) {
        this.f = f;
    }
    
    
    
    
}
