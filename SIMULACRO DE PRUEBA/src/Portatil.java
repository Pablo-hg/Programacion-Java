
public class Portatil extends PC{
    
    private int pantalla;
    
    public Portatil(double prec_base, int ram, double velocidad,int pantalla) {
        super(prec_base, ram, velocidad);
        this.pantalla = pantalla;
    }

    public int getPantalla() {
        return pantalla;
    }
    
    

    @Override
    public boolean esSobremesa() {
        return false;
    }

    @Override
    public double getPrecio() {
        if (this.pantalla==15)
            return super.prec_base + super.ram*50 + 100;
        else // la pantalla es de 17
            return super.prec_base + super.ram*50 + 150;
    }
    
    @Override
    public String descripcion(){
        return "Portátil : Procesador " + super.velocidad + " con : " +
                super.ram + " GB: " + this.getPrecio() + "\n";
    }
    
    
    public int compareTo(PC pc) {
        if (this.getPrecio() < pc.getPrecio())
            return -1;
        else if (this.getPrecio() == pc.getPrecio())
            return 0;
        else //(this.calcularAutonomia() > o.calcularAutonomia())
            return 1;
    }
    
    
    
}
