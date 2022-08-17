public abstract class Vagon {
    
    private String numeracion;

    public Vagon(String numeracion) {
        this.numeracion = numeracion;
    }

    public String getNumeracion() {
        return numeracion;
    }
     
    
	
    public abstract double volumen();
    
}