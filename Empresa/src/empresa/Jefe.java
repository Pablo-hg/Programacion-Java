package empresa;

public class Jefe extends Empleado{
    
    private int num_anios;
    private double suplemento;
    
    public Jefe(String nombre, int num_anios) {
        /*this.nombre = nombre;
        this.sueldo_base = 1000;*/
        super(nombre);
        this.num_anios = num_anios;
        this.suplemento = 500; 
    }
    
    @Override
    public double sueldo(){
        return this.suplemento*this.num_anios + super.sueldo();
    }
    
    /*public void mostrar(){
        //super.mostrar();
        System.out.println("Sueldo total :" + this.sueldo());
        
    }*/
           
     @Override
    public String toString(){
        /*return "Nombre: " + this.getNombre() + "Sueldo: " + this.sueldo() +
                " Número de años: " + this.num_anios + " Suplemento: " + this.suplemento;*/
        String s = super.toString();
        
        return s + " Sueldo: " + this.sueldo() +
                " Número de años: " + this.num_anios + 
                " Suplemento: " + this.suplemento;
       
       
    }
}
    