

public class Administrador {
    
  private String nombre;
	
	private String dni;
	
	private int aniosServicio;

	public Administrador(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
        
        
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getAñosServicio() {
		return aniosServicio;
	}
	
	public void aumentarAniosServicio(){
		aniosServicio++;
	}
    
        
}
