
package ejercicio4bis;

import java.io.Serializable;

public class Jugador implements Serializable{
    
    private String nombre;
    private int goles;
    private int puntos;

    public Jugador(String nombre, int goles, int puntos) {
        this.nombre = nombre;
        this.goles = goles;
        this.puntos = puntos;
    }


    public String getNombre() {
        return nombre;
    }

    public int getGoles() {
        return goles;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    } 
    
    @Override
    public String toString(){
        return this.nombre + " " + this.goles + " " + this.puntos;
    }
    
    
}
