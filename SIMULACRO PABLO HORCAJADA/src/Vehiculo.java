
public class Vehiculo {
    
    private String marca;
    
    private String modelo;
    
    private String matricula;

    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }
    
     public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
        }
    
}
