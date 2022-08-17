
public class VagonMercancias extends Vagon{
    
    private double carga;
	
    private  double tara;
	
    private double volumen;

    public VagonMercancias(double carga, double tara, double volumen, String numeracion) {
        super(numeracion);
        this.carga = carga;
        this.tara = tara;
        this.volumen = volumen;
    }    
    	
    
    @Override
    public double volumen() {
        return volumen;
    }
		
    public String toString(){
		return this.volumen() + "\n" + this.carga + "\n" + this.tara;
    }
    
    public int compareTo(VagonMercancias o) {
        if (this.tara < o.tara)
            return -1;
        else if (this.tara == o .tara)
            return 0;
        else
            return 1;
    }
      
    
}
