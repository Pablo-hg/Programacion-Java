
package clinica;

public abstract class Prueba {
    
    private int duracion;
    
    private String id;
    
    private Recurso [] recursos;

    public Prueba(int duracion, String id) {
        this.duracion = duracion;
        this.id = id;
    }

    public Prueba(int duracion, String id, Recurso[] recursos) {
        this.duracion = duracion;
        this.id = id;
        this.recursos = recursos;
    }
    
    public int getDuracion() {
        return duracion;
    }

    public String getId() {
        return id;
    }

    public Recurso[] getRecursos() {
        return recursos;
    }

    public void setRecursos(Recurso[] recursos) {
        this.recursos = recursos;
    }
    
    
    
}
