
public class Sobremesa extends PC{
    
    
    private String tipo_caja;
    
    public Sobremesa(double prec_base, int ram, double velocidad, String tipo_caja ) {
        super(prec_base, ram, velocidad);
        this.tipo_caja = tipo_caja;
    }
    

    public String getTipo_caja() {
        return tipo_caja;
    }

   
    @Override
    public boolean esSobremesa() {
        return true;
    }
    
    public double getPrecio(){
        if (this.tipo_caja=="ATX")
            return super.prec_base + super.ram*40 + 120;
        else // la caja es tipo ATX
            return super.prec_base + super.ram*40 + 100;
    }
    
    @Override
    public String descripcion(){
        return "Sobremesa : Procesador " + super.velocidad + " con : " +
                super.ram + " GB: " + this.getPrecio() + "\n";
    }
    
}
