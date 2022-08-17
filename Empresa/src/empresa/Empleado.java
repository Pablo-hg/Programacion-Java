package empresa;

public class Empleado {
    
    private double sueldo_base;
    
    private String nombre;

    public Empleado(String nombre) {
        this.sueldo_base = 1000;
        this.nombre = nombre;
    }
    
    public double sueldo() {
        return sueldo_base;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /*public void mostrar(){
        System.out.println("Nombre: " + this.nombre);        
        System.out.println("Sueldo base: " + this.sueldo_base);
    }*/
    
     @Override
    public String toString(){
        return "Nombre: " + this.nombre +        
        " Sueldo base: " + this.sueldo_base;
    }
    
    
    
}