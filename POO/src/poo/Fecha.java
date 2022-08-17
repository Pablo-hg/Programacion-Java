
package poo;

public class Fecha {
    //atributos: caracterizan a la clase
    //dia, mes, año
    private int dia;
    
    private int mes;
    
    private int anio;
    
    //contructores
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    //gettters y setters
    //accesores y modificadores
    
    //accesores
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    //modificadores
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    public boolean esBisiesto(){
        if (((this.anio % 4) == 0)&&((this.anio % 100) != 0)||
                ((this.anio % 400) == 0))
            return true;
        else
            return false;
    }
    
    public boolean validarFecha(){
        boolean diaCorrecto, mesCorrecto, anioCorrecto;
        anioCorrecto = this.anio > 0;
        mesCorrecto =  this.mes > 0 && this.mes < 13;
        diaCorrecto =  this.mes > 0 && this.mes < 31;
    
        
        return
               diaCorrecto = (this.dia > 0) && (this.dia < 31);  
        
    }
}


