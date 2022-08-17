
package binarios;

import java.io.Serializable;

public class Alumno implements Serializable{
    
    private char Nombre;
    private int nota;

    public Alumno(char Nombre, int nota) {
        this.Nombre = Nombre;
        this.nota = nota;
    }

    public char getNombre() {
        return Nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNombre(char Nombre) {
        this.Nombre = Nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString(){
        return this.Nombre + " " + this.nota;
    }
    
    public static void main(String[] args) {
        
       
        
    }
    
}
