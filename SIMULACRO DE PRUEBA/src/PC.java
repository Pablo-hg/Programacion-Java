
public abstract class PC {
    
    public double prec_base;
    public int ram;
    public double velocidad;

    public double getPrec_base() {
        return prec_base;
    }

    public int getRam() {
        return ram;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public PC(double prec_base, int ram, double velocidad) {
        this.prec_base = prec_base;
        this.ram = ram;
        this.velocidad = velocidad;
    }
    
    public abstract boolean esSobremesa();
    
    
    
    public abstract double getPrecio();
        
    
    public String descripcion(){
        String cad = "";
        return cad;
    }
}
