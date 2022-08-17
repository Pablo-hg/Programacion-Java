package empresa;

public class Viajante extends Empleado{
    
    private int num_viajes;
    private double dieta;
    
    public Viajante(String nombre, int num_viajes) {
        /*this.nombre = nombre;
        this.sueldo_base = 1000;*/
        super(nombre);
        this.dieta = 300;
        this.num_viajes = num_viajes; 
    }
    
    @Override
    public double sueldo(){
        return super.sueldo() + this.num_viajes*this.dieta;
    }
    
    /*public void mostrar(){
        //super.mostrar();
        System.out.println("Sueldo total: " + this.sueldo());
        
    }*/
    
    public String toString(){
      /*return "Nombre: " + this.getNombre() + " Sueldo: " + 
                this.sueldo() + " Número de viajes: " + this.num_viajes +
                " Dieta: " + this.dieta;*/
        String s = super.toString();
        
        return s + " Sueldo: " + this.sueldo() + " Número de viajes: " + 
                this.num_viajes + " Dieta: " + this.dieta;
    }
    
}
    