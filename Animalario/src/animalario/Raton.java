package animalario;
public class Raton {
    
    //definimos los atributos como privados
    private String cod_ref;
    private Fecha fecha_nac;
    private int peso;
    private Sexo sexo;
    private double temp;
    private String libre;

    //construcotres
    public Raton(String cod_ref, Fecha fecha_nac, int peso, Sexo sexo, double temp, String libre) {
        this.cod_ref = cod_ref;
        this.fecha_nac = fecha_nac;
        this.peso = peso;
        this.sexo = sexo;
        this.temp = temp;
        this.libre = libre;
    }
    //construcotres
    
    //getters
    public String getCod_ref() {
        return cod_ref;
    }

    public Fecha getFecha_nac() {
        return fecha_nac;
    }

    public int getPeso() {
        return peso;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public double getTemp() {
        return temp;
    }

    public String getLibre() {
        return libre;
    }
    //getters
    
    //setters
    public void setCod_ref(String cod_ref) {
        this.cod_ref = cod_ref;
    }

    public void setFecha_nac(Fecha fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setLibre(String libre) {
        this.libre = libre;
    }
    //setters
    
    public String toString(){
        //CR....
        //Fecha nacimineto.....
        //Peso....
        //Sexo...
        //temperatura...
        //Libre......
        
        return "CR: " + this.cod_ref + "\n" + "Fecha nacimineto: " + this.fecha_nac + "\n" +
                "Peso: " + this.peso + " gramos" + "\n" + "Sexo: " + this.sexo + "\n" +
                "Temp: " + this.temp + "ºC" + "\n" + "Libre: " + this.libre;
    }
    
}
