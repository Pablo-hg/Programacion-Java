package animalario;
public class Fecha {
    
    private int dia;
    private int mes;
    private int año;

    //getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    //getters
    
    //setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }
    //setters

    //constructores
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    //constructores

    //constructor vacio por defecto
    public Fecha() {
        
        this.dia = 1;
        this.mes = 1;
        this.año = 1970;
    }
    
    
    public String toString(){
        //01/01/1970
        String d = "";
        String m = "";
        String a = "";
        if (this.dia<10)
            d = "0";
        if (this.mes<10)
            m = "0";
        if (this.año<10)
            a = "0";
        return d + this.dia + "/" + m + this.mes + "/" + a + this.año;
        
    }
    
    
    
    
}
