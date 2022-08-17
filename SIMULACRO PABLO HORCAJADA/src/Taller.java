 
import java.util.ArrayList;

public class Taller {
    
    private String nombre;
    
    private String direccion;
    
    private int licencia;
    
    private Administrador administrador;
    
    private ArrayList<Vehiculo> lista;
    
     public Taller(String nombre, String direccion, int licencia, String dniA, String nombreA) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.licencia = licencia;
        this.administrador = new Administrador(dniA, nombreA);//llamar al constructor
        this.lista = new ArrayList<Vehiculo>();//inicializar la lista a vacío
    }
   
     public String getDireccion() {
        return direccion;
    }

    public int getLicencia() {
        return licencia;
    }
    
    public Administrador getAdministrador() {
        return administrador;
    }
    
    public String datosAdministrador(){
        return this.administrador.getNombre() + " : " + this.administrador.getDni();
    }
    
    
    public void aumentarAniosServicioAdmin(){
        this.administrador.aumentarAniosServicio();
    }
    
    public static boolean comprobarLicencia(int numlicencia){
        //ver si la suma de los dígitos de numlicencia es múltiplo de 10
        int sum_dig = 0;
        
        while (numlicencia > 0){
            sum_dig = sum_dig + (numlicencia%10);
            numlicencia = numlicencia/10;
        }
        
        return (sum_dig%10 == 0);
        
    }
    
    private boolean existeVehiculo(Vehiculo v){
        String matricula = v.getMatricula();
        
        int i = 0;
        
        boolean encontrado = false;
        
        while(i < this.lista.size() && !encontrado){
            if (matricula.equals(this.lista.get(i).getMatricula())){
                encontrado = true;
            }
            else
                i++;
        }
        return encontrado;
    }
    
    public boolean anadirVehiculo (Vehiculo v){
        boolean b = false;
        if (!this.existeVehiculo(v)){
            this.lista.add(v);
            b = true;
        }
        return b;
    }
    
    public boolean eliminarVehiculo (Vehiculo v){
        boolean b = false;
        int i = 0;
        String matricula = v.getMatricula();
        if (this.existeVehiculo(v)){
           while (i < this.lista.size() && !b){
               if (matricula.equals(this.lista.get(i).getMatricula())){
                   this.lista.remove(i);
                   b = true;
               }
               else
                   i++;
           } 
        }
        return b;
    }

    public static void main(String[] args) {
        
        boolean res = Taller.comprobarLicencia(123473);
        System.out.println(res);
        
        Taller t = new Taller("Programacion", "Pirineos 55", 123473, "123473A", "Juan");
        
        Vehiculo v = new Coche("Seat", "Toledo", "1234DYV");//Polimorfismo
        
        boolean a1 = t.anadirVehiculo(v);
        
        boolean a2 = t.anadirVehiculo(v);
        
        System.out.println(a1);
        
        System.out.println(a2);
        
        Coche c = new Coche("Seat", "Ateca", "1235DYV");//Polimorfismo
        
        boolean e1 = t.eliminarVehiculo(c);
        
        boolean e2 = t.eliminarVehiculo(v);
        
        System.out.println(e1);
        
        System.out.println(e2);
        
    }
    
}