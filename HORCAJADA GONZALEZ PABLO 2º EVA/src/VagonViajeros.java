public class VagonViajeros extends Vagon{
    
        private int num_viajeros;
	
	private double ancho;
	
	private double alto;
	
	private double largo;

        public VagonViajeros(int num_viajeros, double ancho, double alto, double largo, String numeracion) {
            super(numeracion);
            this.num_viajeros = num_viajeros;
            this.alto = alto;
            this.ancho = ancho;
            this.largo = largo;
            
        }	
	
	public int num_viajeros(){
		return num_viajeros;
	}
        
        
	@Override
	public double volumen() {
		return ancho*alto*largo;
	}
        
        public String toString(){
		return this.volumen() + " , " + this.num_viajeros();
	}
    
}
